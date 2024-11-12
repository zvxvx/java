import java.math.BigDecimal;
import java.util.Scanner;

public class CSCD210Methods {

    private static double findAvgOfDigits(int input) {
        int sum = 0;
        int numLength = Integer.toString(input).length();
        int[] numArr = Integer.toString(input).chars().map(c -> c - '0').toArray();
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        return (double) sum / numLength;
    }

    public static void lightOrHeavy(int theNum, Scanner kb) {
        if (theNum < 1 || kb == null) {
            throw new IllegalArgumentException("Number cannot be less than 1 and input cannot be null.");
        }
        double avgDigits = findAvgOfDigits(theNum);
        System.out.print("Please input a second number: ");
        int inputNum = kb.nextInt();
        double secondAvgDigits = findAvgOfDigits(inputNum);
        String lightOrHeavy = avgDigits > secondAvgDigits ? "Heavy" : "Light";
        System.out.println("The number is: " + lightOrHeavy);
    }

    public static int readPosNum(Scanner kb) {
        if (kb == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        int inputNum;
        do {
            System.out.print("Please enter a positive number: ");
            inputNum = kb.nextInt();
        } while (inputNum <= 0);
        return inputNum;
    }

    public static int menu(Scanner kb) {
        if (kb == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        int input;
        do {
            System.out.println("Menu Choices are: ");
            System.out.println("1) Enter a new number");
            System.out.println("2) Print the number of even/odd/zeros");
            System.out.println("3) Print if the number is light or heavy");
            System.out.println("4) Print the value of E");
            System.out.println("5) Print the number in reverse order");
            System.out.println("6) Quit");
            System.out.print("Please enter your choice: ");
            input = kb.nextInt();
        } while (input < 1 || input > 6);
        return input;
    }

    public static void printE(int theNum) {
        if (theNum < 1) {
            throw new IllegalArgumentException("Input must be a positive number.");
        }
        System.out.println(BigDecimal.valueOf(Math.exp(theNum)));
    }

    public static void printReverse(int theNum) {
        int[] numArray = Integer.toString(theNum).chars().map(c -> c - '0').toArray();
        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.print(numArray[i]);
        }
        System.out.print("\n");
    }

    public static void oddEvenZero(int theNum) {
        if (theNum < 1) {
            throw new IllegalArgumentException("Input must be a positive number.");
        }
        byte odd = 0, even = 0, zero = 0;
        int[] numArray = Integer.toString(theNum).chars().map(c -> c - '0').toArray();
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 0) {
                zero++;
            } else if (numArray[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The number " + theNum + " contains " + odd + " odd number(s) " + even + " even number(s) and " + zero + " zero(s).");
    }
}
