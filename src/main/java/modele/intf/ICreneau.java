package modele.intf;

import modele.ModeleException;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public interface ICreneau {
    int getId();
    void setId(int id);
    LocalDateTime getDateDebut();
    void setDateDebut(LocalDateTime dateDebut) throws ModeleException;
    LocalDateTime getDateFin();
    void setDateFin(LocalDateTime dateFin) throws ModeleException;
    boolean isInterne();
    void setInterne(boolean interne);
    IFormation getFormation();
    void setFormation(IFormation formation);
    List<IStagiaire> getListStagiaires();
    void setListStagiaires(List<IStagiaire> listStagiaires);
    List<IFormateur> getListFormateurs();
    void setListFormateurs(List<IFormateur> listFormateurs);
}
