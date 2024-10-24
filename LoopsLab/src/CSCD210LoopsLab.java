import java.util.Scanner;

public class CSCD210LoopsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int userNumber = input.nextInt();
        int choice;
        while (userNumber <= 0) {
            System.out.println("Number must be a positive integer.");
            System.out.print("Try again: ");
            userNumber = input.nextInt();
        }
        do {
            System.out.println("\n");
            System.out.println("Current #: " + userNumber);
            System.out.println("=====MENU=====");
            System.out.println("1. Enter a new number");
            System.out.println("2. Print the number of odd digits, even digits and zeros in the integer");
            System.out.println("3. Print the prime numbers between 2 and the integer (inclusive)");
            System.out.println("4. Quit the program");
            System.out.println("==============");
            System.out.print("Please enter your choice: ");
            choice = input.nextInt();
            System.out.println("==============");
            System.out.println("\n");
            switch (choice) {
                case 1:
                    System.out.print("Enter a new positive integer: ");
                    userNumber = input.nextInt();
                    System.out.println("The number has been changed to: " + userNumber);
                    break;
                case 2:
                    char[] myNumArr = Integer.toString(userNumber).toCharArray();
                    digitCounter(myNumArr, userNumber);
                    break;
                case 3:
                    primeUpTo(userNumber);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Choice must be 1, 2, 3, or 4.");
            }
        } while (choice != 4);
    }

    public static boolean isPrime(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeUpTo(int num) {
        if (num == 1) {
            System.out.println("1 isn't going to work for this option. Try a bigger number.");
        } else {
            System.out.println("PRIMES <= " + num);
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void digitCounter(char[] arr, int num) {
        byte odd = 0, even = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            byte digit = (byte) (arr[i] - '0');
            if (digit % 2 == 0 && digit != 0) {
                even++;
            } else if (digit == 0) {
                zero++;
            } else {
                odd++;
            }
        }
        String printOut = "There are a total of: ";
        System.out.println("For the number " + num + ":");
        System.out.println(printOut + odd + " odd numbers.");
        System.out.println(printOut + even + " even numbers.");
        System.out.println(printOut + zero + " zeros.");
    }
}