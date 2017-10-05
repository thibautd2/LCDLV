package tests;

import application.Costumer;
import junit.framework.TestCase;

/**
 * Created by thiba on 05/10/2017.
 */
public class CostumerTest extends TestCase {

    public void testOrder_tea() throws Exception {
        Costumer costumer = new Costumer();

        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, 0));
        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, -5));
    }

    public void testOrder_tea_with_Suggar() throws Exception {
        Costumer costumer = new Costumer();

        assertEquals("T:1:0",costumer.order(Costumer.BEVARAGE.tea, 1));
        assertEquals("T:2:0",costumer.order(Costumer.BEVARAGE.tea, 2));
        assertEquals("T:2:0",costumer.order(Costumer.BEVARAGE.tea, 158));
    }


    public void testOrder_cofee() throws Exception {
        Costumer costumer = new Costumer();

        assertEquals("C::",costumer.order(Costumer.BEVARAGE.cofee, 0));
    }

    public void testOrder_chocolate() throws Exception {
        Costumer costumer = new Costumer();

        assertEquals("H::",costumer.order(Costumer.BEVARAGE.chocolate, 0));

    }

}