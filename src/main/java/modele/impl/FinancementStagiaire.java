package modele.impl;

import modele.ModeleException;
import modele.intf.IFinancement;
import modele.intf.IFinancementStagiaire;
import modele.intf.IStagiaire;

import java.time.LocalDate;
/**
 * Created by VTanchereau on 28/06/2017.
 */
public class FinancementStagiaire implements IFinancementStagiaire {

    private IStagiaire stagiaire;
    private IFinancement financement;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public FinancementStagiaire(IStagiaire stagiaire, IFinancement financement, LocalDate _dateDebut, LocalDate _dateFin) throws ModeleException {
        this.stagiaire = stagiaire;
        this.financement = financement;
        this.checkDate(_dateDebut, _dateFin);
        this.dateDebut = _dateDebut;
        this.dateFin = _dateFin;
    }

    public FinancementStagiaire(IStagiaire stagiaire, IFinancement financement, LocalDate _dateDebut) throws ModeleException {
        this.stagiaire = stagiaire;
        this.financement = financement;
        this.checkDate(_dateDebut, null);
        this.dateDebut = _dateDebut;
    }

    @Override
    public IStagiaire getStagiaire() {
        return stagiaire;
    }

    @Override
    public void setStagiaire(IStagiaire stagiaire) {
        this.stagiaire = stagiaire;
    }

    @Override
    public IFinancement getFinancement() {
        return financement;
    }

    @Override
    public void setFinancement(IFinancement financement) {
        this.financement = financement;
    }

    @Override
    public LocalDate getDateDebut() {
        return dateDebut;
    }

    @Override
    public void setDateDebut(LocalDate _dateDebut) throws ModeleException {
        this.checkDate(_dateDebut, this.dateFin);
        this.dateDebut = _dateDebut;
    }

    @Override
    public LocalDate getDateFin() {
        return dateFin;
    }

    @Override
    public void setDateFin(LocalDate _dateFin) throws ModeleException {
        this.checkDate(this.dateDebut, _dateFin);
        this.dateFin = _dateFin;
    }

    private void checkDate(LocalDate _dateDebut, LocalDate _dateFin) throws ModeleException {
        if (_dateDebut == null){
            throw new ModeleException("Les dates ne sont pas valides");
        }
        if (_dateFin != null && (_dateDebut.isAfter(_dateFin) || _dateDebut.isEqual(_dateFin))){
            throw new ModeleException("Les dates ne sont pas valides");
        }
    }

}
