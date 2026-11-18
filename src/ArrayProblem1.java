
public class ArrayProblem1 { // Main class ng program.
    public static void main(String[] args) { // Dito magsisimula ang program.

        double[] temperatures = new double[5]; // Gumawa ng double array na kayang mag-store ng 5 temperatures.

        temperatures[0] = 32.5; // I-assign ang 32.5 sa first day.
        temperatures[1] = 34.0; // I-assign ang 34.0 sa second day.
        temperatures[2] = 31.8; // I-assign ang 31.8 sa third day.
        temperatures[3] = 33.2; // I-assign ang 33.2 sa fourth day.
        temperatures[4] = 35.1; // I-assign ang 35.1 sa fifth day.

        System.out.println("Temperatures for 5 Days:"); // I-print ang heading.

        for (int i = 0; i < temperatures.length; i++) { // Loop para ma-print ang lahat ng temperatures.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // I-print ang day number at temperature.
        } // End ng for loop.

        temperatures[2] = 32.0; // Palitan ang temperature ng third day mula 31.8 to 32.0.

        System.out.println("Updated Temperature for Day 3: " + temperatures[2]); // I-print ang updated temperature ng third day.

    } // End ng main method.
} // End ng Main class.

