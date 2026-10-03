import javax.swing.*;
import java.util.Scanner;

public class Assignment2Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.printf("Gross Pay: Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
        System.out.printf("Net Pay: Php %.2f%n", netPay);

        input.close();
    }

    public static class Assignment2JOption {
        public static void main(String[] args) {

            String rateInput = JOptionPane.showInputDialog(
                    "Enter hourly pay rate:"
            );

            String hoursInput = JOptionPane.showInputDialog(
                    "Enter hours worked:"
            );

            double rate = Double.parseDouble(rateInput);
            double hours = Double.parseDouble(hoursInput);

            double grossPay = rate * hours;
            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            String output = String.format(
                    "Gross Pay: Php %.2f\n" +
                            "Withholding Tax: Php %.2f\n" +
                            "Net Pay: Php %.2f",
                    grossPay, withholdingTax, netPay
            );

            JOptionPane.showMessageDialog(null, output);
        }
    }
}