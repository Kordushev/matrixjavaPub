import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stripe[] stripes = new Stripe[50];
        /*for (Stripe s:stripes){
            s = new Stripe(50);
        }*/

        for (int i=0; i < stripes.length; i++) {
            stripes[i] = new Stripe(50);
        }
        System.out.println(stripes[0].visible);
        System.out.println(stripes[1].visible);
        System.out.println(stripes[2].visible);
        System.out.println(stripes[3].visible);
        System.out.println(stripes[4].visible);
        System.out.println(stripes[5].visible);
    }
}