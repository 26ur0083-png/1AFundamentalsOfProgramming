
import javax.swing.JOptionPane;

public class Looping3JOption {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;

        do {
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Current Balance: P" + String.format("%.2f", balance) +
                                    "\nEnter amount (0 to stop):"
                    )
            );

            if (amount > 0) {
                balance += amount;
            }
            else if (amount < 0) {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                }
            }

            if (amount != 0) {
                JOptionPane.showMessageDialog(null,
                        "Outstanding Balance: P" +
                                String.format("%.2f", balance));
            }

        } while (amount != 0);

        JOptionPane.showMessageDialog(null, "Transaction ended.");
    }
}

