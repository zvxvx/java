import java.util.Scanner;

public class CSCD210LoopsLab {
    public static boolean isPrime(int input) {
        // Sqrt of input below reduces iterations compared to using input - 1
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a positive integer to analyze: ");
        int userNumber = input.nextInt();
        if (userNumber <= 0) {
            System.out.println("Number must be a positive integer");
        }
        while (userNumber >= 1) {
            System.out.println("=====THE ALMIGHTY MENU=====");
            System.out.println("1. Enter a new number");
            System.out.println("2. Print the number of odd digits, even digits and zeros in the integer");
            System.out.println("3. Print the prime numbers between 2 and the integer (inclusive)");
            System.out.println("4. Quit the program");
            System.out.println("===========================");
            System.out.print("Please enter your choice: ");
            int choice = input.nextInt();
            char[] myNumArr = Integer.toString(userNumber).toCharArray();
            switch (choice) {
                case 1:
                    System.out.print("Enter a new positive integer to analyze: ");
                    userNumber = input.nextInt();
                    break;
                case 2:
                    byte odd = 0, even = 0, zero = 0;
                    for (int i = 0; i < myNumArr.length; i++) {
                        byte digit = (byte) (myNumArr[i] - '0');
                        if (digit % 2 == 0 && digit != 0) {
                            even++;
                        } else if (digit == 0) {
                            zero++;
                        } else {
                            odd++;
                        }
                    }
                    System.out.println("For the number " + userNumber);
                    System.out.println("There are a total of: " + odd + " odd numbers.");
                    System.out.println("There are a total of: " + even + " even numbers.");
                    System.out.println("There are a total of: " + zero + " zeros.");
                    break;
                case 3:
                    if (userNumber == 1) {
                        System.out.println("Invalid input for this option.");
                    } else {
                        System.out.println("=====PRIMES <= " + userNumber + "=====");
                        for (int i = 2; i <= userNumber; i++) {
                            if (isPrime(i)) {
                                System.out.print(i + " ");
                            }
                        }
                        System.out.print("\n");
                        System.out.println("===========================");
                    }
                    break;
                case 4:
                    userNumber = 0;
                    break;
            }
        }
    }
}