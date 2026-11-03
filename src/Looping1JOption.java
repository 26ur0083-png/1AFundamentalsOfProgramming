
import javax.swing.JOptionPane;

public class Looping1JOption {
    public static void main(String[] args) {

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            int number = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number " + i + ":")
            );

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest +
                        "\nLowest number: " + lowest);
    }
}

