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
        if (kb == null){
            throw new IllegalArgumentException("Input cannot be null.");
        }
        int inputNum;
        do {
            System.out.print("Please enter a positive number: ");
            inputNum = kb.nextInt();
        } while (inputNum <= 0);
        return inputNum;
    }
    public static int menu(Scanner kb){
        if (kb == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        int input;
        do{
            System.out.println("Menu Choices are: ");
            System.out.println("1) Enter a new number");
            System.out.println("2) Print the number of even/odd/zeros");
            System.out.println("3) Print if the number is light or heavy");
            System.out.println("4) Print the value of E");
            System.out.println("5) Print the number in reverse order");
            System.out.println("6) Quit");
            System.out.print("Please enter your choice: ");
            input = kb.nextInt();
        } while(input < 1 || input > 6);
        return input;
    }
}
