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

//    @Test(expected = ModeleException.class)
//    public void testSetNull(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode(null);
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstruct4Chriffre(){
//        Specialite specialite = new Specialite(0, "test", "1111");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCode4Chriffre(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("1111");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstruct2Chiffre(){
//        Specialite specialite = new Specialite(0, "test", "11");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCode2Chiffre(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("11");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructEmpty(){
//        Specialite specialite = new Specialite(0, "test", "");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeEmpty(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructOneLetter(){
//        Specialite specialite = new Specialite(0, "test", "11A");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeOneLetter(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("11A");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructOneNumber(){
//        Specialite specialite = new Specialite(0, "test", "1AA");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeOneNumber(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("1AA");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstruct3Lettres(){
//        Specialite specialite = new Specialite(0, "test", "AAA");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCode3Lettres(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("AAA");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructSpaceBefore(){
//        Specialite specialite = new Specialite(0, "test", "  1");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeSpaceBefore(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("  1");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructSpaceAfter(){
//        Specialite specialite = new Specialite(0, "test", "1  ");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeSpaceAfter(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("1  ");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testConstructSpaceBetween(){
//        Specialite specialite = new Specialite(0, "test", " 111 ");
//    }
//
//    @Test(expected = ModeleException.class)
//    public void testSetCodeSpaceBetween(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode(" 111 ");
//    }
//
//    @Test
//    public void testContructEtSetOK(){
//        Specialite specialite = new Specialite(0, "test", "111");
//        specialite.setCode("356");
//        assertTrue(true);
//    }

}
