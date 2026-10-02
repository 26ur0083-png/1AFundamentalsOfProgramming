import javax.swing.JOptionPane;
import java.awt.*;

///
public class LabQuiz3 {
    public static void main(String[] args) {
        String hi = "Welcome!";
        JOptionPane.showMessageDialog(null, hi);

        int oldSalary;
        oldSalary = Integer.parseInt(JOptionPane.showInputDialog("Please enter your old salary."));

        double increase = oldSalary * 0.1775;
        double balance = increase * 2;
        double newsalary = oldSalary + increase;

        String msg = "Your old salary is " + oldSalary + " pesos." + "\n" + "Your balance is " + balance + " pesos." + "\n" + "Your new salary is " + newsalary + " pesos.";
        JOptionPane.showMessageDialog(null, msg);
    }
}