import java.util.Scanner;

public class CSCD210IfsLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the beginning meter reading ");
        int firstMeterReading = input.nextInt();
        System.out.print("Enter the ending meter reading ");
        int lastMeterReading = input.nextInt();
        System.out.print("Enter 'r' for residential or 'b' for business ");
        String initialCodeInput = input.next().toLowerCase();
        char code = initialCodeInput.charAt(0);

    }
}