package modele.intf;

import java.util.List;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public interface IFinancement {
    int getId();
    void setId(int id);
    String getLibelle();
    void setLibelle(String libelle);
    List<IFinancementStagiaire> getListFinancementsStagiaires();
    void setListFinancementsStagiaires(List<IFinancementStagiaire> listStagiaires);
}
