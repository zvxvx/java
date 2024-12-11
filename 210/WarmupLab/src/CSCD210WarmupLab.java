import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210WarmupLab {
    public static void main(String[] args) {
        //Import Scanner so we can take user input.
        Scanner input = new Scanner(System.in);
        // Take in user's shoe size.
        System.out.print("Please enter your shoe size (no half sizes): ");
        int shoeSize = input.nextInt();
        // Take in user's birth year.
        System.out.print("Please enter your birth year (yyyy): ");
        int bYear = input.nextInt();
        // Format shoeSizeAndAge result based on the imported DecimalFormat we specified in the fmt var.
        DecimalFormat fmt = new DecimalFormat("00,00");
        // IDE complains if number isn't cast as long for some reason... works either way.
        String shoeSizeAndAge = fmt.format((shoeSize * 5L + 50) * 20 + 1024 - bYear);
        // Output the following text with shoeSizeAndAge result.
        System.out.println("Your shoe size is the numbers before the comma, and your age (presuming you've had your " +
                "bday for 2024) is the numbers after the comma: " + shoeSizeAndAge);
    }
}
