import java.util.Random;

public class Stripe {
    int chance,
        stripeCounter,
        maxStripeLength = 10;
    char symbol;
    Random rnd = new Random();

    Stripe(int chance) {
        this.chance = chance;
    }

    char printMatrix (){
        if (stripeCounter == 0){
            int newStripeCounter = rnd.nextInt(100);
            if (newStripeCounter > chance){
                stripeCounter = rnd.nextInt(maxStripeLength);
            }
            else{
                symbol = (char)32;
            }
        }
        else{
            String pangramm = "Jackdaws love my big sphinx of quartz";
            int symbolPosition = rnd.nextInt( pangramm.length());
            symbol = pangramm.charAt(symbolPosition);
            stripeCounter--;
        }
        return symbol;
    }
}
