package application;

/**
 * Created by thiba on 05/10/2017.
 */
public class Costumer {


    public enum BEVARAGE {
        tea {
            public String toString() {
                return "T";
            }
        },
        cofee {
            public String toString() {
                return "C";
            }
        },
        chocolate {
            public String toString() {
                return "H";
            }
        },
        orangeJuice {
            public String toString() {
                return "O";
            }
        }

    }


    private float money;

    public Costumer() {
        money = 0;
    }

    public Costumer(float money) {
        this.money = money;
    }


    public float getPrice(BEVARAGE bevarage) {
        float price = 0;
        switch (bevarage) {
            case chocolate:
                price = 0.5f;
                break;
            case cofee:
                price = 0.6f;
                break;
            case tea:
                price = 0.4f;
                break;
            case orangeJuice:
                price = 0.6f;
                break;
        }
        return price;
    }


    public String order(BEVARAGE bevarage, Integer suggarAmmont, Boolean extraHot) {
        String order = bevarage.toString();
        String suggar = "";
        String stick = "";
        float beveragePrice = getPrice(bevarage);


        if(extraHot && bevarage != BEVARAGE.orangeJuice)
            order +="h";

        if (bevarage == BEVARAGE.orangeJuice || suggarAmmont < 0)
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
        }
        order = order + ":" + suggar + ":" + stick;
        return order;
    }

    public String show_Message(String messageContent) {
        String message = "M:";
        return message + messageContent;
    }


    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

}
