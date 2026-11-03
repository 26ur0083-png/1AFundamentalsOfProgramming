import java.io.*;

public class Assignment3BR {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double nsat, salary, entrance, average;

        System.out.print("Enter NSAT score: ");
        nsat = Double.parseDouble(input.readLine());

        System.out.print("Enter parents' monthly salary: ");
        salary = Double.parseDouble(input.readLine());

        System.out.print("Enter entrance exam score: ");
        entrance = Double.parseDouble(input.readLine());

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
    }
}

