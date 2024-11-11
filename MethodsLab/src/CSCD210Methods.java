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
        System.out.println("Please input a second number: ");
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
}
