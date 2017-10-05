package application;
import application.CofeeMachine.*;

import static application.CofeeMachine.getPrice;
import static application.CofeeMachine.registerOrder;
import static application.CofeeMachine.show_Message;

/**
 * Created by thiba on 05/10/2017.
 */
public class Costumer {

    private float money;

    public Costumer() {
        money = 0;
    }

    public Costumer(float money) {
        this.money = money;
    }


    public String order(BEVARAGE bevarage, Integer suggarAmmont, Boolean extraHot) {
        String order = bevarage.toString();
        String suggar = "";
        String stick = "";



        float beveragePrice = getPrice(bevarage);

        if(extraHot && bevarage != BEVARAGE.orangeJuice)
            order +="h";

        if (suggarAmmont < 0 || bevarage == BEVARAGE.orangeJuice )
            suggarAmmont = 0;

        if (suggarAmmont > 0) {
            if (suggarAmmont > 2)
                suggarAmmont = 2;
            suggar = String.valueOf(suggarAmmont);
            stick = "0";
        }

        if (beveragePrice > money) {
            float change = beveragePrice - money;
            return show_Message("Need : " + change + "");
        } else {
            money -= beveragePrice;
            registerOrder(beveragePrice, bevarage);
        }
        order = order + ":" + suggar + ":" + stick;
        return order;
    }



    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

}
