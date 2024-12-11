import java.util.Scanner;

public class CSCD210BuggedMiniLab {
    public static void main(String[] args) {

        //1 Incompatible types. Found: 'java.lang.String', required: 'char'
        char[] singleChar = {"hello", "friend"};

        //2 ';' expected
        String word = "word"

        //3 Cannot resolve symbol 'nothing'
        if (nothing == singleChar[0]) {
            System.out.println("Hello");
        }

        //4 Identifier expected
        int[] intArray = new [5];

        //5 wrong type leads to 3 being 51
        int[] anotherIntArray = {1,2,'3',4,5};

        //6 printing out an int array is not possible using this format.
        // Needs to be wrapped in Arrays.toString() first.
        System.out.println(anotherIntArray);

        //7 cannot find symbol variable i
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }

        //8 runtime exception out of bounds
        for (int i = 0; i <= anotherIntArray.length; i++) {
            System.out.println(anotherIntArray[i]);
        }

        //9 a number cannot be less than 2 and greater than 2.
        // print statement will never occur.
        // Condition 'theNumber < 2 && theNumber > 2' is always 'false'
        int theNumber = 4;
        if (theNumber < 2 && theNumber > 2){
            System.out.println("Success");
        }

        //10 cases are type strings while the condition is an int.
        Scanner input = new Scanner(System.in);
        int theChoice = input.nextInt();
        switch (theChoice) {
            case "1": //java: incompatible types: java.lang.String cannot be converted to int
                System.out.println("You chose option 1");
            case "2": //java: incompatible types: java.lang.String cannot be converted to int
                System.out.println("You chose option 2");
            case "3": //java: incompatible types: java.lang.String cannot be converted to int
                System.out.println("You chose option 3");
        }
    }
}