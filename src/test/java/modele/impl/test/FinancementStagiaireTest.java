package modele.impl.test;

import static org.junit.Assert.*;

import modele.ModeleException;
import modele.impl.FinancementStagiaire;
import modele.proxy.ProxyFinancement;
import modele.proxy.ProxyStagiaire;
import org.junit.Test;


import java.time.LocalDate;

/**
 * Created by VTanchereau on 29/06/2017.
 */
public class FinancementStagiaireTest {

    @Test (expected = ModeleException.class)
    public void testConstructDatesEgales(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesFinEgale(){
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now().minusDays(5);
        finStg.setDateFin(date3);
    }

    @Test (expected = ModeleException.class)
    public void testSetDatesDebutEgale(){
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now();
        finStg.setDateDebut(date3);
    }

    @Test (expected = ModeleException.class)
    public void testConstructDateFinBefore(){
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().minusDays(5);
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
    }

    @Test (expected = ModeleException.class)
    public void testSetDateFinBefore(){
        LocalDate date1 = LocalDate.now().minusDays(5);
        LocalDate date2 = LocalDate.now();
        ProxyStagiaire proxS = new ProxyStagiaire(0);
        ProxyFinancement proxF = new ProxyFinancement(0);
        FinancementStagiaire finStg = new FinancementStagiaire(proxS, proxF, date1, date2);
        LocalDate date3 = LocalDate.now().minusDays(10);
        finStg.setDateFin(date3);
    }
}
