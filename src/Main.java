import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String output="";
        Stripe[] stripes = new Stripe[50];

        for (int i=0; i<stripes.length; i++) {
            stripes[i] = new Stripe(93);
        }

        for (int k=0; k<100; k++) {
            output = "";
            for (int i = 0; i < stripes.length; i++) {
                char o = stripes[i].printMatrix();
                output += o;
            }
            System.out.println(output);
        }
    }
}