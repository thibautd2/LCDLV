package tests;


import application.Costumer;
import application.CofeeMachine.BEVARAGE;

import junit.framework.TestCase;

import static application.CofeeMachine.show_Message;

/**
 * Created by thiba on 05/10/2017.
 */
public class OrderTest extends TestCase {

    public void testOrder_tea() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("T::",costumer.order(BEVARAGE.tea, 0, false));
        assertEquals("T::",costumer.order(BEVARAGE.tea, -5, false));
    }

    public void testOrder_cofee() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("C::",costumer.order(BEVARAGE.cofee, 0, false));
    }

    public void testOrder_chocolate() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("H::",costumer.order(BEVARAGE.chocolate, 0, false));
    }

    public void testOrder_OrangeJuice()
    {
        Costumer costumer = new Costumer(0.6f);

        assertEquals("O::",costumer.order(BEVARAGE.orangeJuice, 5, true));
        costumer.setMoney(0.6f);
        assertEquals("O::",costumer.order(BEVARAGE.orangeJuice, 0, false));
        costumer.setMoney(0f);
        assertEquals("M:",costumer.order(BEVARAGE.orangeJuice, 0, false).substring(0,2));

    }

    public void testOrder_with_Suggar() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("T:1:0",costumer.order(BEVARAGE.tea, 1, false));
        assertEquals("H:2:0",costumer.order(BEVARAGE.chocolate, 2, false));
        assertEquals("C:2:0",costumer.order(BEVARAGE.cofee, 158, false));
    }


    public void testExtraHot()
    {

        Costumer costumer = new Costumer(10f);

        assertEquals("Th:1:0",costumer.order(BEVARAGE.tea, 1, true));
        assertEquals("Hh:2:0",costumer.order(BEVARAGE.chocolate, 2, true));
        assertEquals("Ch:2:0",costumer.order(BEVARAGE.cofee, 158, true));

    }

    public void testShow_Message()
    {
        Costumer costumer = new Costumer();

        assertEquals("M:", show_Message(""));
        String content = "Not enough money";
        assertEquals("M:Not enough money", show_Message(content));

    }


}