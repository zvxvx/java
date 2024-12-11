import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CSCD210APILab {

    public static final int YEAR = 2024;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char ltr, upperLtr;
        String name, character, middleLast, middle;
        int birthYear, last;

       do {
           System.out.print("Please enter a single alphabetical character: ");
           character = kb.next();
       } while (character.length() != 1 || Character.isDigit(character.charAt(0)));

        ltr = character.toLowerCase().charAt(0);
        upperLtr = character.toUpperCase().charAt(0);

        System.out.print("Please enter your full name: ");
        name = kb.next();
        middleLast = kb.nextLine();
        System.out.print("Please enter your birth year: ");
        birthYear = kb.nextInt();

        char[] fullName = (name + middleLast).toCharArray();
        char[] fullNameQuestion = new char[fullName.length];


        middle = middleLast.substring(middleLast.indexOf(' '), middleLast.lastIndexOf(' ')).stripLeading();
        last = middleLast.substring(middleLast.lastIndexOf(' ') + 1).hashCode();

        System.out.println("The first letter of your name is: " + name.charAt(0));
        System.out.println("The last letter of your name is: " + middleLast.charAt(middleLast.length() - 1));
        System.out.println("Your middle name is: " + middle);
        System.out.println("Hash code of last name + YEAR + birth year: " + (last + YEAR + birthYear));
        for (int i = 0; i < fullName.length; i++) {
            if (fullName[i] == ltr || fullName[i] == upperLtr) {
                fullNameQuestion[i] = '?';
            } else {
                fullNameQuestion[i] = fullName[i];
            }
        }
        System.out.print("Name with character '" + ltr +"' replaced: ");
        System.out.println(fullNameQuestion);
    }
}