package modele.impl;

import modele.ModeleException;
import modele.impl.Formation;
import modele.intf.ICreneau;
import modele.intf.IFormateur;
import modele.intf.IFormation;
import modele.intf.IStagiaire;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public class Creneau implements ICreneau{

    private int id;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private boolean interne;
    private IFormation formation;
    private List<IStagiaire> listStagiaires;
    private List<IFormateur> listFormateurs;

    public Creneau(int id, LocalDateTime _dateDebut, LocalDateTime _dateFin, boolean interne, IFormation formation) throws ModeleException {
        this.id = id;
        this.checkDate(_dateDebut, _dateFin);
        this.checkDuree(_dateDebut, _dateFin);
        this.dateDebut = _dateDebut;
        this.dateFin = _dateFin;
        this.interne = interne;
        this.formation = formation;
        this.listStagiaires = new ArrayList<>();
        this.listFormateurs = new ArrayList<>();
    }

    public Creneau(LocalDateTime _dateDebut, LocalDateTime _dateFin, boolean interne, IFormation formation) throws ModeleException {
        this.checkDate(_dateDebut, _dateFin);
        this.checkDuree(_dateDebut, _dateFin);
        this.dateDebut = _dateDebut;
        this.dateFin = _dateFin;
        this.interne = interne;
        this.formation = formation;
        this.listStagiaires = new ArrayList<>();
        this.listFormateurs = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime _dateDebut) throws ModeleException {
        this.checkDate(_dateDebut, this.dateFin);
        this.checkDuree(_dateDebut, this.dateFin);
        this.dateDebut = _dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime _dateFin) throws ModeleException {
        this.checkDate(this.dateDebut, _dateFin);
        this.checkDuree(this.dateDebut, _dateFin);
        this.dateFin = _dateFin;
    }

    public boolean isInterne() {
        return interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }

    public IFormation getFormation() {
        return formation;
    }

    public void setFormation(IFormation formation) {
        this.formation = formation;
    }

    public List<IStagiaire> getListStagiaires() {
        return listStagiaires;
    }

    public void setListStagiaires(List<IStagiaire> listStagiaires) {
        this.listStagiaires = listStagiaires;
    }

    public List<IFormateur> getListFormateurs() {
        return listFormateurs;
    }

    public void setListFormateurs(List<IFormateur> listFormateurs) {
        this.listFormateurs = listFormateurs;
    }

    private void checkDate(LocalDateTime _dateDebut, LocalDateTime _dateFin) throws ModeleException {
        if (_dateDebut == null || _dateFin == null){
            throw new ModeleException("Les dates ne sont pas valides");
        }
        if (_dateDebut.isAfter(_dateFin) || _dateDebut.isEqual(_dateFin)){
            throw new ModeleException("Les dates ne sont pas valides");
        }
    }

    private void checkDuree(LocalDateTime _dateDebut, LocalDateTime _dateFin) throws ModeleException {
        if (!_dateFin.isEqual(_dateDebut.plusHours(3).plusMinutes(30))){
            throw new ModeleException("Le créneau n'as oas une durée de 3h30");
        }
    }

    private void checkListStagiaires() throws ModeleException{
        // parcourir la liste des stagiaires

        for(IStagiaire stagiaire1 : this.getListStagiaires()){
            for(IStagiaire stagiaire2 : this.getListStagiaires()){
                if(stagiaire1.equals(stagiaire2)){
                    throw new ModeleException("Le stagiaire ne peut pas être présent deux fois dans un crénzau.");
                }
            }
        }

        for(IStagiaire stagiaire : this.getListStagiaires()){
            for(ICreneau creneauTemp : stagiaire.getListCreneaux()){
                if(!this.equals(creneauTemp) && this.chevauche(creneauTemp)){
                    throw new ModeleException("Le créneau n'as oas une durée de 3h30");
                }
            }
        }

        // regarder si les creneaux chevauchent
    }

    public boolean chevauche(ICreneau creneauTemp){
        return false;
    }

    @Override
    public String toString() {
        return "Creneau{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", formation=" + formation +
                '}';
    }
}
