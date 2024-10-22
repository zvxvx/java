import java.util.Scanner;

public class CSCD210LoopsLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a postiive integer to analyze: ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out.println("Number must be a positive integer");
        }
        while (userNumber > 0) {
            System.out.println("1. Enter a new number");
            System.out.println("2. Print the number of odd digits, even digits and zeros in the integer");
            System.out.println("3. Print the prime numbers between 2 and the integer (inclusive)");
            System.out.println("4. Quit the program");
            System.out.println("Please enter your choice: ");
            int choice = input.nextInt();
            char[] myNumArr = Integer.toString(userNumber).toCharArray();
            switch (choice) {
                case 1:
                    System.out.print("Enter a new positive integer to analyze: ");
                    userNumber = input.nextInt();
                    break;
                case 2:
                    for (int i = 0; i < myNumArr.length; i++) {
                        byte digit = (byte) (myNumArr[i] - '0');
                        System.out.println(digit);
                    }
                    break;
                case 3:

            }
        }
    }
}