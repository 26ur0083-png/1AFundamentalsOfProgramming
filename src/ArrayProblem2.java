
import java.util.Arrays; // Import Arrays para magamit ang deepToString().

public class ArrayProblem2 { // Main class ng program.
 public static void main(String[] args) { // Dito magsisimula ang program.

  String[][] seats = { // Gumawa ng 2D String array na may pangalang seats.
          {"Alice", "Bob", "Charlie"}, // Mga pangalan sa first row.
          {"David", "Emma", "Frank"} // Mga pangalan sa second row.
  }; // End ng array.

  System.out.println("Person in Row 2, Column 3: " + seats[1][2]); // I-print si Frank gamit ang index [1][2].

  seats[0][1] = "Vacant"; // Palitan si Bob ng Vacant dahil nasa index [0][1] siya.

  System.out.println("Updated Seating Arrangement:"); // I-print ang heading ng updated seating arrangement.

  System.out.println(Arrays.deepToString(seats)); // I-print ang buong 2D array sa isang line.

 } // End ng main method.
} // End ng Main class.

