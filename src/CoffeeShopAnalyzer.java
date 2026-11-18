
public class CoffeeShopAnalyzer {
    public static void main(String[] args) {

        // Gumawa ng integer array na naglalaman ng sales mula Monday hanggang Sunday.
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

        // For loop para ipakita ang sales ng bawat araw.
        for (int i = 0; i < weeklySales.length; i++) {

            // Ipinapakita ang araw at bilang ng cups na nabenta.
            // Ang i + 1 ay ginagamit para magsimula sa Day 1.
            System.out.println("Day " + (i + 1) + " sales: " + weeklySales[i]);
        }

        // Gumawa ng variable para sa total sales.
        // Nagsisimula sa 0 dahil wala pang nadadagdag.
        int totalSales = 0;

        // For loop para kunin ang sales ng bawat araw.
        for (int i = 0; i < weeklySales.length; i++) {

            // Idinadagdag ang daily sales sa totalSales.
            totalSales += weeklySales[i];
        }

        // Ipinapakita ang kabuuang sales sa buong linggo.
        System.out.println("Total Sales: " + totalSales);

        // Kinukuwenta ang average sales kada araw.
        // Ginagamit ang (double) para makakuha ng decimal answer.
        double averageSales = (double) totalSales / weeklySales.length;

        // Ipinapakita ang average sales kada araw.
        System.out.println("Average Sales: " + averageSales);

        // Ginagawang unang value sa array ang initial highest sales.
        int maxSales = weeklySales[0];

        // For loop para hanapin ang pinakamataas na sales.
        for (int i = 0; i < weeklySales.length; i++) {

            // Sinusuri kung mas mataas ang current sales sa maxSales.
            if (weeklySales[i] > maxSales) {

                // Kapag mas mataas, papalitan ang maxSales ng bagong value.
                maxSales = weeklySales[i];
            }
        }

        // Ipinapakita ang pinakamataas na sales sa buong linggo.
        System.out.println("Highest Sales: " + maxSales);

        // For loop para malaman kung anong araw nakuha ang highest sales.
        for (int i = 0; i < weeklySales.length; i++) {

            // Tinitingnan kung ang sales sa araw na ito ay katumbas ng maxSales.
            if (weeklySales[i] == maxSales) {

                // Ipinapakita ang araw kung kailan pinakamataas ang sales.
                System.out.println("Best Sales Day: Day " + (i + 1));
            }
        }
    }
}

