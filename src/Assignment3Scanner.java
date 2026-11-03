import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nsat, salary, entrance, average;

        System.out.print("Enter NSAT score: ");
        nsat = input.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        salary = input.nextDouble();

        System.out.print("Enter entrance exam score: ");
        entrance = input.nextDouble();

        average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        }
        else if (salary <= 3500 && average >= 91) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("FOR FURTHER STUDY");
        }

        input.close();
    }
}