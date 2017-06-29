package modele.impl;

import modele.ModeleException;
import modele.intf.IFormation;
import modele.intf.ISpecialite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VTanchereau on 27/06/2017.
 */
public class Specialite implements ISpecialite {
    private int id;
    private String nom;
    private String code;
    private List<IFormation> listFormations;

    public Specialite(int id, String nom, String _code) throws ModeleException {
        this.id = id;
        this.nom = nom;
        try{
            this.checkCode(_code);
        }catch (ModeleException e){
            throw e;
        }
        this.code = _code;
        this.listFormations = new ArrayList<>();
    }

    public Specialite(String nom, String _code) throws ModeleException {
        this.nom = nom;
        try{
            this.checkCode(_code);
        }catch (ModeleException e){
            throw e;
        }
        this.code = _code;
        this.listFormations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws ModeleException {
        try{
            this.checkCode(code);
        }catch (ModeleException e){
            throw e;
        }
        this.code = code;
    }

    public List<IFormation> getListFormations() {
        return listFormations;
    }

    public void setListFormations(List<IFormation> listFormations) {
        this.listFormations = listFormations;
    }

    private void checkCode(String codeToCheck) throws ModeleException {
        if (codeToCheck == null){
            throw new ModeleException("Le code n'est pas valide");
        }
        if (codeToCheck.length() != 3){
            throw new ModeleException("Le code n'est pas valide");
        }
        try{
            int temp = Integer.parseInt(codeToCheck);
        }catch (Exception e){
            throw new ModeleException("Le code n'est pas valide");
        }
    }

    @Override
    public String toString() {
        return "Specialite{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
