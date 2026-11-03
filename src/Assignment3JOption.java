import javax.swing.JOptionPane;

public class Assignment3JOption {
    public static void main(String[] args) {

        double nsat, salary, entrance, average;

        nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:")
        );

        salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:")
        );

        entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:")
        );

        average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
        else if (salary <= 3500 && average >= 91) {
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        }
        else {
            JOptionPane.showMessageDialog(null, "FOR FURTHER STUDY");
        }
    }
}