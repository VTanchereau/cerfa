package modele.impl;

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

    public FinancementStagiaire(IStagiaire stagiaire, IFinancement financement, LocalDate dateDebut, LocalDate dateFin) {
        this.stagiaire = stagiaire;
        this.financement = financement;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public FinancementStagiaire(IStagiaire stagiaire, IFinancement financement, LocalDate dateDebut) {
        this.stagiaire = stagiaire;
        this.financement = financement;
        this.dateDebut = dateDebut;
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
    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Override
    public LocalDate getDateFin() {
        return dateFin;
    }

    @Override
    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

}
