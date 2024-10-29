import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CSCD210APILab {
    public static final int YEAR = 2024;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char ltr;
        String name;
        int birthYear;

        System.out.print("Please enter a single alphabetical character: ");
        ltr = kb.next().toLowerCase().charAt(0);

        System.out.print("Please enter your full name: ");
        name = kb.next();
        String middleLast = kb.nextLine().strip();
        char[] middleLastArr = middleLast.toCharArray();

        System.out.print("Please enter your birth year: ");
        birthYear = kb.nextInt();

        char[] middle = new char[middleLast.indexOf(' ')];

        for (byte i = 0; i < middleLast.indexOf(' '); i++) {
            middle[i] = middleLastArr[i];
        }
        String last = middleLast.substring(middle.length).strip(); //try substring

        System.out.println(last);
        System.out.println("The first letter of your name is: " + name.charAt(0));
        System.out.println("The last letter of your name is: " + middleLast.charAt(middleLast.length() - 1));
        System.out.println(middle);
    }
}