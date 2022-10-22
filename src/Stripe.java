import java.util.Random;

public class Stripe {
     private int stripeCounter;
     private int chanceOfVisibility;
     boolean visible;
     Random rnd;

    public Stripe(int percentOfVisibility){
        rnd = new Random();
        this.chanceOfVisibility = rnd.nextInt(100);

        if (this.chanceOfVisibility < percentOfVisibility) {
            this.visible = true;
        }
        else{
            this.visible = false;
        }
        this.stripeCounter = rnd.nextInt(6);
    }

    public char output(){
        if (visible == true) {
            char symbol;
            symbol = (char) rnd.nextInt(127);
            this.stripeCounter--;
            return symbol;
        }
        else {
            stripeCounter--;
            return ' ';
        }
    }
}
