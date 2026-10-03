import java.util.*;
public class Quiz2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Welcome to Adobo Cooking Show");

        System.out.print("Please enter your name: ");
        String name = Input.nextLine();

        System.out.print("How many kilo of pork will you cook? ");
        int pork = Input.nextInt();

        double soy = pork * 0.5;
        double vinegar = pork * 0.33;

        System.out.println("The ratio of soy sauce for " + pork + "kg is = " + soy);
        System.out.println("The ratio of vinegar for " + pork + "kg is = " + vinegar);


    }
}
