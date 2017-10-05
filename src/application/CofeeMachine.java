package application;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thiba on 05/10/2017.
 */
public class CofeeMachine {

    private static float total;
    static HashMap<BEVARAGE, Integer> report;

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


    public static void registerOrder(float price, BEVARAGE bevarage)
    {
        total+=price;
        if(report == null)
            report = new HashMap<>();

        if(report.get(bevarage) != null)
            report.replace(bevarage, report.get(bevarage)+1);
        else
            report.put(bevarage, 1);
    }

    public static void printReport()
    {
        for(Map.Entry<BEVARAGE, Integer> entry : report.entrySet()) {
           System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        System.out.println("Total :" + total);
    }

    public static float getPrice(CofeeMachine.BEVARAGE bevarage) {
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

    public static String  show_Message(String messageContent) {
        String message = "M:";
        return message + messageContent;
    }

}
