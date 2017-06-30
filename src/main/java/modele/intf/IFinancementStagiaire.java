package modele.intf;

import modele.ModeleException;

import java.time.LocalDate;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public interface IFinancementStagiaire {

    IStagiaire getStagiaire();
    void setStagiaire(IStagiaire stagiaire);
    IFinancement getFinancement();
    void setFinancement(IFinancement financement);
    LocalDate getDateDebut();
    void setDateDebut(LocalDate dateDebut) throws ModeleException;
    LocalDate getDateFin();
    void setDateFin(LocalDate dateFin) throws ModeleException;
}
