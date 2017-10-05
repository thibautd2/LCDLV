package tests;

import application.CofeeMachine;
import application.Costumer;
import junit.framework.TestCase;

/**
 * Created by thiba on 05/10/2017.
 */
public class ReportTest extends TestCase {

    public void testReport()
    {
        Costumer costumer = new Costumer(12f);

        costumer.order(CofeeMachine.BEVARAGE.orangeJuice, 5, true);
        costumer.order(CofeeMachine.BEVARAGE.chocolate, 0, false);
        CofeeMachine.printReport();
    }


}
