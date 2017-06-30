package modele.impl.test;

import static org.junit.Assert.*;

import modele.ModeleException;
import modele.impl.FinancementStagiaire;
import modele.proxy.ProxyFinancement;
import modele.proxy.ProxyStagiaire;
import org.junit.Assert;
import org.junit.Test;


import java.time.LocalDate;

/**
 * Created by VTanchereau on 29/06/2017.
 */
public class FinancementStagiaireTest {

    @Test (expected = ModeleException.class)
    public void testConstructDatesEgales() throws ModeleException {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesFinEgale() throws ModeleException{
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now().minusDays(5);
        finStg.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesDebutEgale() throws ModeleException{
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now();
        finStg.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateFinBefore() throws ModeleException{
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().minusDays(5);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateFinBefore() throws ModeleException{
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now().minusDays(10);
        finStg.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateDebutAfter() throws ModeleException{
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now().plusDays(10);
        finStg.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateDebutNull() throws ModeleException{
        LocalDate date1 = null;
        LocalDate date2 = LocalDate.now().minusDays(5);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateDebutNull() throws ModeleException{
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = null;
        finStg.setDateDebut(date3);
    }

    @Test
    public void testConstructDateFinNull(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = null;
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        try {
            FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testConstructDateFinNull");
        }
        assertTrue(true);
    }

    @Test
    public void testSetDateFinNull(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(10);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = null;
        try {
            finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinNull");
        }
        LocalDate date3 = null;
        try {
            finStg.setDateFin(date3);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinNull");
        }
        assertTrue(true);
    }

    @Test
    public void testConstructDateOk(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(10);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        try {
            FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testConstructDateOk");
        }
        assertTrue(true);
    }

    @Test
    public void testSetDateFinOk(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(5);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = null;
        try {
            finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        LocalDate date3 = LocalDate.now().plusDays(10);
        try {
            finStg.setDateFin(date3);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateFinOk");
        }
        assertTrue(true);
    }

    @Test
    public void testSetDateDebutOk(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(5);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = null;
        try {
            finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateDebutOk");
        }
        LocalDate date3 = LocalDate.now().minusDays(10);
        try {
            finStg.setDateDebut(date3);
        } catch (ModeleException e) {
            fail("erreur dans la méthode testSetDateDebutOk");
        }
        assertTrue(true);
    }
}
