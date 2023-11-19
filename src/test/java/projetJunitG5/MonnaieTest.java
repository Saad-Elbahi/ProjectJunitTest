package projetJunitG5;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MonnaieTest {

	Monnaie monnaie;

    @Before
    public void setUp() {
        monnaie = new Monnaie(50, "DH");
    }

    @Test
    public void testAjouter() {
        Monnaie autreMonnaie = new Monnaie(30, "DH");
        monnaie.ajouter(autreMonnaie);
        assertEquals("80 DH", monnaie.toString());
    }

    @Test
    public void testRetrancher() {
        Monnaie autreMonnaie = new Monnaie(20, "DH");
        monnaie.retrancher(autreMonnaie);
        assertEquals("30 DH", monnaie.toString());
    }

    @Test
    public void testAjouterWithDifferentDevise() {
        Monnaie autreMonnaie = new Monnaie(30, "USD");
        monnaie.ajouter(autreMonnaie);
        assertEquals("50 DH", monnaie.toString());
    }

    @Test
    public void testRetrancherWithDifferentDevise() {
        Monnaie autreMonnaie = new Monnaie(20, "USD");
        monnaie.retrancher(autreMonnaie);
        assertEquals("50 DH", monnaie.toString());
    }



}
