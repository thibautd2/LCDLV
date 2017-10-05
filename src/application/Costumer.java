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
        }
    }



    public String order(BEVARAGE bevarage, Integer suggarAmmont)
    {
        String order = bevarage.toString();
        String suggar = "";
        String stick = "";

        if(suggarAmmont < 0 )
            suggarAmmont = 0;

        if(suggarAmmont > 0) {
            if(suggarAmmont > 2)
                suggarAmmont = 2;
            suggar = String.valueOf(suggarAmmont);
            stick = "0";
        }

        order = order+":"+suggar+":"+stick;
        return order ;
    }




}
