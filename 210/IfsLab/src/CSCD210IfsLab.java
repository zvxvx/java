import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210IfsLab {
    public static final double RES_BASE = 25.00;
    public static final double BUS_BASE = 1500.00;
    public static final double RES_PER_GALLON = 0.0003;
    public static final double BUS_PER_GALLON_USAGE_LOW = 0.00002;
    public static final double BUS_PER_GALLON_USAGE_HIGH = 0.00001;
    public static void main(String[] args) {
        double rawGallons;
        DecimalFormat money = new DecimalFormat ("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the beginning meter reading: ");
        int firstMeterReading = input.nextInt();

        System.out.print("Enter the ending meter reading: ");
        int lastMeterReading = input.nextInt();

        System.out.print("Enter 'r' for residential or 'b' for business: ");
        char code = input.next().toLowerCase().charAt(0);

        if (firstMeterReading > lastMeterReading) {
            rawGallons = (1_000_000_000 - firstMeterReading) + lastMeterReading;
        } else {
            rawGallons = lastMeterReading - firstMeterReading;
        }
        double gallons = rawGallons / 10;

        System.out.println("======");
        System.out.println("Customer code: " + code);
        System.out.println("Beginning meter reading: " + firstMeterReading);
        System.out.println("Ending meter reading: " + lastMeterReading);
        System.out.println("Gallons of Water Used: " + gallons);
        if (code == 'r') {
            double rTotal = RES_BASE + (gallons * RES_PER_GALLON);
            System.out.println("Amount Billed: " + "$" + money.format(rTotal));
        } else if (code == 'b') {
            double bTotal = BUS_BASE;
            for (double i = 0; i <= gallons; i++ ) {
                if (i < 1000) {
                    bTotal += BUS_PER_GALLON_USAGE_LOW;
                } else {
                    bTotal += BUS_PER_GALLON_USAGE_HIGH;
                }
            }
            System.out.println("Amount Billed: " + "$" + money.format(bTotal));
        } else {
            System.out.println("Invalid input.");
        }
        System.out.println("======");
    }
}