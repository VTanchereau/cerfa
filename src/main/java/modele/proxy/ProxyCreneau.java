package modele.proxy;

import dao.DAOFactory;
import dao.DAONames;
import dao.intf.DAO;
import modele.ModeleException;
import modele.impl.Creneau;
import modele.intf.ICreneau;
import modele.intf.IFormateur;
import modele.intf.IFormation;
import modele.intf.IStagiaire;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by VTanchereau on 28/06/2017.
 */
public class ProxyCreneau implements ICreneau {

    private int id;
    private Creneau instance;

    public ProxyCreneau(int id) {
        this.id = id;
        this.instance = null;
    }

    private void getInstance(){
        if (instance == null) {
            DAO<Creneau> dao = DAOFactory.getDAO(DAONames.Creneau);
            this.instance = dao.findById(this.id);
        }
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.getInstance();
        this.instance.setId(id);
    }

    @Override
    public LocalDateTime getDateDebut() {
        this.getInstance();
        return this.instance.getDateDebut();
    }

    @Override
    public void setDateDebut(LocalDateTime dateDebut) {
        this.getInstance();
        try {
            this.instance.setDateDebut(dateDebut);
        } catch (ModeleException e) {
            e.printStackTrace();
        }
    }

    @Override
    public LocalDateTime getDateFin() {
        this.getInstance();
        return this.instance.getDateFin();
    }

    @Override
    public void setDateFin(LocalDateTime dateFin) {
        this.getInstance();
        try {
            this.instance.setDateFin(dateFin);
        } catch (ModeleException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isInterne() {
        this.getInstance();
        return this.instance.isInterne();
    }

    @Override
    public void setInterne(boolean interne) {
        this.getInstance();
        this.instance.setInterne(interne);
    }

    @Override
    public IFormation getFormation() {
        this.getInstance();
        return this.instance.getFormation();
    }

    @Override
    public void setFormation(IFormation formation) {
        this.getInstance();
        this.instance.setFormation(formation);
    }

    @Override
    public List<IStagiaire> getListStagiaires() {
        this.getInstance();
        return this.instance.getListStagiaires();
    }

    @Override
    public void setListStagiaires(List<IStagiaire> listStagiaires) {
        this.getInstance();
        this.instance.setListStagiaires(listStagiaires);
    }

    @Override
    public List<IFormateur> getListFormateurs() {
        this.getInstance();
        return this.instance.getListFormateurs();
    }

    @Override
    public void setListFormateurs(List<IFormateur> listFormateurs) {
        this.getInstance();
        this.instance.setListFormateurs(listFormateurs);
    }

    public String toString(){
        this.getInstance();
        return this.instance.toString();
    }
}
