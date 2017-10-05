package tests;

import application.Costumer;
import junit.framework.TestCase;

/**
 * Created by thiba on 05/10/2017.
 */
public class WalletTest extends TestCase {


    public void testNotEnougthMoney()
    {
        Costumer costumer = new Costumer();
        assertEquals("M:Ne",costumer.order(Costumer.BEVARAGE.tea, 1, false).substring(0,4));
    }

    public void testBuyTea()
    {
        Costumer costumer = new Costumer(0.4f);
        assertEquals("T::",costumer.order(Costumer.BEVARAGE.tea, 0, false));
        assertEquals(costumer.getMoney(), 0f);
        assertEquals("M:Ne",costumer.order(Costumer.BEVARAGE.tea, 1, false).substring(0,4));
    }
}
