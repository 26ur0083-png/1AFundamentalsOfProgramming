import java.io.*;

public class Assignment4BR {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        double height = Double.parseDouble(input.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(input.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = input.readLine().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = input.readLine().charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("Applicant is ACCEPTED.");
        } else {
            System.out.println("Applicant is REJECTED.");
        }
    }
}
