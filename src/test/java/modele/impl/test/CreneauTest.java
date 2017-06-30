package modele.impl.test;

import static org.junit.Assert.*;

import modele.ModeleException;
import modele.impl.Creneau;
import modele.impl.Formateur;
import modele.impl.Stagiaire;
import modele.intf.IFormateur;
import modele.intf.IFormation;
import modele.intf.IStagiaire;
import modele.proxy.ProxyFormation;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VTanchereau on 30/06/2017.
 */
public class CreneauTest {

    @Test(expected = ModeleException.class)
    public void testConstructDatesEgales() throws ModeleException {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesFinEgale() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = LocalDateTime.now().minusDays(5);
        creneau.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesDebutEgale() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = LocalDateTime.now();
        creneau.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateFinBefore() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().minusDays(5);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateFinBefore() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = LocalDateTime.now().minusDays(10);
        creneau.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateDebutAfter() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = LocalDateTime.now().plusDays(5);
        creneau.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateDebutNull() throws ModeleException{
        LocalDateTime date1 = null;
        LocalDateTime date2 = LocalDateTime.now().minusDays(5);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateDebutNull() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = null;
        creneau.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateFinNull() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = null;
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateFinNull() throws ModeleException{
        LocalDateTime date1 = LocalDateTime.now().minusDays(5);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(date1, date2, true, formation);
        LocalDateTime date3 = null;
        creneau.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructHourPlus() throws ModeleException {
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(31);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetHourDebutPlus() throws ModeleException{
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
        LocalDateTime hour3 = LocalDateTime.now().minusHours(3).minusMinutes(31);
        creneau.setDateDebut(hour3);
    }

    @Test (expected = ModeleException.class)
    public void testSetHourFinPlus() throws ModeleException{
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
        LocalDateTime hour3 = LocalDateTime.now().plusHours(3).plusMinutes(31);
        creneau.setDateFin(hour3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructHourMoins() throws ModeleException {
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(29);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
    }

    @Test (expected = ModeleException.class)
    public void testSetHourDebutMoins() throws ModeleException{
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
        LocalDateTime hour3 = LocalDateTime.now().minusHours(3).minusMinutes(29);
        creneau.setDateDebut(hour3);
    }

    @Test (expected = ModeleException.class)
    public void testSetHourFinMoins() throws ModeleException{
        LocalDateTime hour1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime hour2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = new Creneau(hour1, hour2, true, formation);
        LocalDateTime hour3 = LocalDateTime.now().plusHours(3).plusMinutes(29);
        creneau.setDateFin(hour3);
    }


    @Test
    public void testConstructDateOk(){
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        try {
            Creneau creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testConstructDateOk");
        }
        assertTrue(true);
    }

    @Test
    public void testSetDateFinOk(){
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = null;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        LocalDateTime date3 = LocalDateTime.now();
        try {
            creneau.setDateFin(date3);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        assertTrue(true);
    }

    @Test
    public void testSetDateDebutOk(){
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau = null;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        LocalDateTime date3 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        try {
            creneau.setDateDebut(date3);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        assertTrue(true);
    }

    @Test (expected = ModeleException.class)
    public void testListStagiairesNull(){
        List<IStagiaire> listStagiaires = null;
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        creneau.setListStagiaires(listStagiaires);
    }

    @Test
    public void testListFormateursNull(){
        List<IFormateur> listFormateurs = null;
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        creneau.setListFormateurs(listFormateurs);
    }

    @Test
    public void testDeuxStagiairesIdentiques(){
        List<IStagiaire> listStagiaires = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Stagiaire stagiaire1 = new Stagiaire(1, "1", "1", 1 == 1);
        Stagiaire stagiaire2 = new Stagiaire(1, "1", "1", 1 == 1);
        listStagiaires.add(stagiaire1);
        listStagiaires.add(stagiaire2);
        creneau.setListStagiaires(listStagiaires);
    }

    @Test
    public void testDeuxFormateursIdentiques(){
        List<IFormateur> listFormateurs = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Formateur formateur1 = new Formateur(1, "1", "1", 1 == 1);
        Formateur formateur2= new Formateur(1, "1", "1", 1 == 1);
        listFormateurs.add(formateur1);
        listFormateurs.add(formateur2);
        creneau.setListFormateurs(listFormateurs);
    }

    @Test
    public void testFormateurCreneauChevauche(){
        List<IFormateur> listFormateurs = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date1.plusHours(1);
        LocalDateTime date4 = date2.plusHours(1);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau1;
        Creneau creneau2;
        try {
            creneau1 = new Creneau(date1, date2, true, formation);
            creneau2 = new Creneau(date3, date4, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Formateur formateur = new Formateur(1, "1", "1", 1 == 1);
        listFormateurs.add(formateur);
        creneau1.setListFormateurs(listFormateurs);
        creneau2.setListFormateurs(listFormateurs);
    }

    @Test
    public void testStagiaireCreneauChevauche(){
        List<IStagiaire> listStagiaires = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date1.plusHours(1);
        LocalDateTime date4 = date2.plusHours(1);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau1;
        Creneau creneau2;
        try {
            creneau1 = new Creneau(date1, date2, true, formation);
            creneau2 = new Creneau(date3, date4, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Stagiaire stagiaire = new Stagiaire(1, "1", "1", 1 == 1);
        listStagiaires.add(stagiaire);
        creneau1.setListStagiaires(listStagiaires);
        creneau2.setListStagiaires(listStagiaires);
    }

    @Test
    public void testListStagiairesVide(){
        List<IStagiaire> listStagiaires = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        creneau.setListStagiaires(listStagiaires);
        assertTrue(true);
    }

    @Test
    public void testListFormateursVide(){
        List<IFormateur> listFormateurs = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        IFormation formation = new ProxyFormation(0);
        Creneau creneau;
        try {
            creneau = new Creneau(date1, date2, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        creneau.setListFormateurs(listFormateurs);
        assertTrue(true);
    }

    @Test
    public void testFormationDansDeuxCreneauxQuiChevauchent(){
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date1.plusHours(1);
        LocalDateTime date4 = date2.plusHours(1);
        IFormation formation = new ProxyFormation(0);

        Creneau creneau1;
        Creneau creneau2;
        try {
            creneau1 = new Creneau(date1, date2, true, formation);
            creneau2 = new Creneau(date3, date4, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        assertTrue(true);
    }

    @Test
    public void testStagiaireCreneauChevauchePas(){
        List<IStagiaire> listStagiaires = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date1.plusHours(4);
        LocalDateTime date4 = date2.plusHours(4);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau1;
        Creneau creneau2;
        try {
            creneau1 = new Creneau(date1, date2, true, formation);
            creneau2 = new Creneau(date3, date4, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Stagiaire stagiaire = new Stagiaire(1, "1", "1", 1 == 1);
        listStagiaires.add(stagiaire);
        creneau1.setListStagiaires(listStagiaires);
        creneau2.setListStagiaires(listStagiaires);
        assertTrue(true);
    }

    @Test
    public void testFormateurCreneauChevauchePas(){
        List<IFormateur> listFormateurs = new ArrayList<>();
        LocalDateTime date1 = LocalDateTime.now().minusHours(3).minusMinutes(30);
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date1.plusHours(4);
        LocalDateTime date4 = date2.plusHours(4);
        IFormation formation = new ProxyFormation(0);
        Creneau creneau1;
        Creneau creneau2;
        try {
            creneau1 = new Creneau(date1, date2, true, formation);
            creneau2 = new Creneau(date3, date4, true, formation);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
            return;
        }
        Formateur formateur = new Formateur(1, "1", "1", 1 == 1);
        listFormateurs.add(formateur);
        creneau1.setListFormateurs(listFormateurs);
        creneau2.setListFormateurs(listFormateurs);
        assertTrue(true);
    }
}
