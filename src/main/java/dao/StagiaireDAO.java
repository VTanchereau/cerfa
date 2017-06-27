package dao;

import modele.Stagiaire;

import java.util.List;

/**
 * Created by VTanchereau on 27/06/2017.
 */
public interface StagiaireDAO {

    Stagiaire findById(int id);
    List<Stagiaire> findAll();
    Stagiaire insert(Stagiaire objectif);
    Stagiaire update(Stagiaire objectif);
    int delete(Stagiaire objectif);
}
