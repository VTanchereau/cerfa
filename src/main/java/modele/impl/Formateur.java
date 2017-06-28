package modele.impl;

import modele.Personne;
import modele.intf.IFormateur;

/**
 * Created by VTanchereau on 27/06/2017.
 */
public class Formateur extends Personne implements IFormateur{

    public Formateur(int id, String nom, String prenom, boolean interne) {
        super(id, nom, prenom, interne);
    }

    public Formateur(String nom, String prenom, boolean interne) {
        super(nom, prenom, interne);
    }

    public Formateur(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Formateur(String nom, String prenom) {
        super(nom, prenom);
    }

}