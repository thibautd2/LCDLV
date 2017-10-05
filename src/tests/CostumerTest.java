package tests;

import application.Costumer;
import junit.framework.TestCase;

/**
 * Created by thiba on 05/10/2017.
 */
public class CostumerTest extends TestCase {

    public void testOrder_tea() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, 0));
        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, -5));
    }

    public void testOrder_cofee() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("C::",costumer.order(Costumer.BEVARAGE.cofee, 0));
    }

    public void testOrder_chocolate() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("H::",costumer.order(Costumer.BEVARAGE.chocolate, 0));
    }

    public void testOrder_with_Suggar() throws Exception {
        Costumer costumer = new Costumer(20);

        assertEquals("T:1:0",costumer.order(Costumer.BEVARAGE.tea, 1));
        assertEquals("H:2:0",costumer.order(Costumer.BEVARAGE.chocolate, 2));
        assertEquals("C:2:0",costumer.order(Costumer.BEVARAGE.cofee, 158));
    }

    public void testShow_Message()
    {
        Costumer costumer = new Costumer();

        assertEquals("M:", costumer.show_Message(""));
        String content = "Not enough money";
        assertEquals("M:Not enough money", costumer.show_Message(content));

    }

    public void testNotEnougthMoney()
    {
        Costumer costumer = new Costumer();
        assertEquals("M",costumer.order(Costumer.BEVARAGE.tea, 1).substring(0,1));
    }

    public void testBuyTea()
    {
        Costumer costumer = new Costumer(0.4f);
        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, 0));
        assertEquals(costumer.getMoney(), 0f);
        assertEquals("M",costumer.order(Costumer.BEVARAGE.tea, 1).substring(0,1));
    }

}