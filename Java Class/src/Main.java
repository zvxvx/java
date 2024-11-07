import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // arrays
        int[] arrOne = {1,2};
        char[] arrTwo = {'a','b','c'};
        int[] arrFour = new int[4];
        String[] arrThree = {"hello", "again", "one", "two", "friend", "temperature"};
        // an error is thrown
        String aString = arrThree[0];
        for (int i = 0; i < arrThree.length; i++) {
            System.out.print(arrThree[i] + " ");
        }

        // for loops
        for (int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
        }

        /*
        this is an infinite loop
        for (int i = 0; i < 5;) {
            System.out.println(i);
        }
        */

        int sum = 1;
        for (int i = 0; i < arrOne.length; i++) {
            sum *= i;
        }
        System.out.println(sum);

        // do-while
        Scanner kb = new Scanner(System.in);
        String word;
        do {
            System.out.print("Please input a word: ");
            word = kb.next();
        } while (!word.equals("exit"));

        // In the example above, you only need to assign word once,
        // because you run it in the do block in order to have the
        // variable be used in the while condition

        // In a while loop you would have to assign twice so the while
        // statement can use the assignment in the condition set after set
        System.out.print("Please enter a word: ");
        String text = kb.next();
        while (!text.equals("exit")) {
            System.out.print("Please enter a word: ");
            text = kb.next();
        }
        int countdown = 10;
        do {
            System.out.println(countdown);
            countdown -= 1;
        } while (countdown > 0);

        // while loop
        int idx = 0;
        int count = 0;
        while (idx < arrThree.length) {
            if (arrThree[idx].length() > 5) {
                count ++;
            }
            idx++;
        }
        System.out.println(count);

        /*
        while (true) {
            //this will last forever unless a break or a condition
            //that can make it false is used.
        }
        */
        System.out.println("Please enter a number to calculate an average ");
        int numberInput = kb.nextInt();
        int counter = 0;
        int acc = numberInput;
        counter++;
        while (true) {
            System.out.println("Please enter a number to calculate an average ");
            numberInput = kb.nextInt();
            if (numberInput > 0) {
                acc += numberInput;
                counter++;
            } else {
                break;
            }
        }
        System.out.println("We will now find the average of " + acc + " by dividing " + counter + " times: " + (acc / counter));

        // try/catch
        String aNumber = "0";
        try {
            Integer.parseInt(aNumber);
        } catch (Exception e) {
            System.out.println("Incorrect input.");
        }

        // if statements
        if (num > 0 ) {
            System.out.println("Number is positive");
        } else if (num < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        if (num >= 10 && num <= 20) {
            System.out.println("Within range");
        } else {
            System.out.println("Out of range");
        }

        Testing testingThis = new Testing();
        testingThis.settingValues("friend", 4, 1.2);
        System.out.println(testingThis.toString());

        System.out.println("Enter the number for the day of the week ");
        int dayNum = kb.nextInt();
        switch (dayNum) {
            case 0:;
            case 1:;
            case 2:;
            case 3:;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:;
            case 6:
                System.out.println("Weekend");
                break;


        }
    }
}