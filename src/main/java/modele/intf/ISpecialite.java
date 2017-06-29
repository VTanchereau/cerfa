package modele.intf;

import modele.ModeleException;

import java.util.List;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public interface ISpecialite {
    int getId();
    void setId(int id);
    String getNom();
    void setNom(String nom);
    String getCode();
    void setCode(String code) throws ModeleException;
    List<IFormation> getListFormations();
    void setListFormations(List<IFormation> listFormations);

}
