package fr.ensup.demo.tdd.test;

import service.Calculatrice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jose on 06/03/2019.
 */

public class calculatriceTest {

    private Calculatrice calculatrice;

    public calculatriceTest() {
    }

    @Before
    public void initialiserDonneestest() {
        this.calculatrice = new Calculatrice ();
    }


    @Test
    public void testAddition() {
        //fail("test fail");
        int resultat = this.calculatrice.addition(1, 1);
        Assert.assertEquals(2, (int)resultat);
    }
}
