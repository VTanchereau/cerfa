package modele.impl.test;

import static org.junit.Assert.*;

import modele.ModeleException;
import modele.impl.Specialite;
import org.junit.Test;
/**
 * Created by VTanchereau on 29/06/2017.
 */
public class SpecialiteTest {

    @Test(expected = ModeleException.class)
    public void testConstructNull() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", null);
    }

    @Test(expected = ModeleException.class)
    public void testSetNull() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode(null);
    }

    @Test(expected = ModeleException.class)
    public void testConstruct4Chriffre() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "1111");
    }

    @Test(expected = ModeleException.class)
    public void testSetCode4Chriffre() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("1111");
    }

    @Test(expected = ModeleException.class)
    public void testConstruct2Chiffre() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "11");
    }

    @Test(expected = ModeleException.class)
    public void testSetCode2Chiffre() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("11");
    }

    @Test(expected = ModeleException.class)
    public void testConstructEmpty() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeEmpty() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("");
    }

    @Test(expected = ModeleException.class)
    public void testConstructOneLetter() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "11A");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeOneLetter() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("11A");
    }

    @Test(expected = ModeleException.class)
    public void testConstructOneNumber() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "1AA");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeOneNumber() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("1AA");
    }

    @Test(expected = ModeleException.class)
    public void testConstruct3Lettres() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "AAA");
    }

    @Test(expected = ModeleException.class)
    public void testSetCode3Lettres() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("AAA");
    }

    @Test(expected = ModeleException.class)
    public void testConstructSpaceBefore() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "  1");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeSpaceBefore() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("  1");
    }

    @Test(expected = ModeleException.class)
    public void testConstructSpaceAfter() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "1  ");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeSpaceAfter() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("1  ");
    }

    @Test(expected = ModeleException.class)
    public void testConstructSpaceBetween() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", " 111 ");
    }

    @Test(expected = ModeleException.class)
    public void testSetCodeSpaceBetween() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode(" 111 ");
    }

    @Test
    public void testContructEtSetOK() throws ModeleException {
        Specialite specialite = new Specialite(0, "test", "111");
        specialite.setCode("356");
        assertTrue(true);
    }

}
