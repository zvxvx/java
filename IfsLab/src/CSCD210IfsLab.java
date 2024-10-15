import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210IfsLab {
    public static final double RES_BASE = 25;
    public static final double BUS_BASE = 1500;
    public static final double RES_PER_GALLON = 0.0003;
    public static final double BUS_PER_GALLON_LOW = 0.00002;
    public static final double BUS_PER_GALLON_HIGH = 0.00001;
    public static void main(String[] args) {
        DecimalFormat moneyFormat = new DecimalFormat ("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the beginning meter reading: ");
        int firstMeterReading = input.nextInt();
        System.out.print("Enter the ending meter reading: ");
        int lastMeterReading = input.nextInt();
        System.out.print("Enter 'r' for residential or 'b' for business: ");
        char code = input.next().toLowerCase().charAt(0);
        double gallonsUsed = (double) (lastMeterReading - firstMeterReading) / 10;

        if (code == 'r') {
            System.out.println("Residential");
            System.out.println("Beginning meter reading: " + firstMeterReading);
            System.out.println("Ending meter reading: " + lastMeterReading);
            System.out.println("Gallons used: " + gallonsUsed);
        } else if (code == 'b') {
            System.out.println("Business");
        } else {
            System.out.println("Invalid input.");
        }
    }
}