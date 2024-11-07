import java.util.Arrays;
import java.util.Scanner;

public class CSCD210DebuggerMiniLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] singleChar = {'h', 'f'};

        String word = "word";

        char nothing = input.next().charAt(0);
        if (nothing == singleChar[0]) {
            System.out.println("Hello");
        }

        int[] intArray = new int[5];

        int[] anotherIntArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(anotherIntArray));

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        for (int i = 0; i < anotherIntArray.length; i++) {
            System.out.println(anotherIntArray[i]);
        }

        int theNumber = 4;
        if (theNumber < 2 || theNumber > 2){
            System.out.println("Success");
        }

        int theChoice = input.nextInt();
        switch (theChoice) {
            case 1:
                System.out.println("You chose option 1");
            case 2:
                System.out.println("You chose option 2");
            case 3:
                System.out.println("You chose option 3");
        }
    }
}