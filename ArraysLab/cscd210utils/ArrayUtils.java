package cscd210utils;

import java.util.Scanner;

/**
 * The ArrayUtils class performs basic array functions, such as adding an item to the array
 * removing items from the array, printing the arrays.<br>
 * All parameters will be passed as final. <br>
 * All pre- and post- conditions will be enforced
 */
@SuppressWarnings({"ExplicitArrayFilling", "UnnecessaryLocalVariable", "ManualArrayCopy", "ConstantValue"})
public class ArrayUtils {
    /**
     * The createAndFillArray method creates the integer array of size num and then fills the array by
     * asking the user to enter an integer.
     *
     * @param num Representing the size of the array to create
     * @param kb  Representing the Scanner object to the keyboard
     * @return int[] Representing created array that is filled with integers
     * @throws IllegalArgumentException if num is less than or equal to 0
     * @throws IllegalArgumentException if kb is null
     */
    public static int[] createAndFillArray(final int num, final Scanner kb) {
        if (num < 1 || kb == null)
            throw new IllegalArgumentException("bad params createAndFill");

        int[] array = new int[num];

        System.out.print("Please enter a number to fill your array with: ");
        int numberFill = kb.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = numberFill;
        }
        return array;
    }// end method

    /**
     * The addNum method makes a new array that is one more in length the old array which is passed in.
     * The method then copies the values from the old array (index by index) and places the values in
     * the new array.
     * Finally, the user is prompted to enter a value and that value is placed within the new array in
     * the last index.
     *
     * @param myArray Representing the old array of integers that will be copied.
     * @param kb      Representing the Scanner object to the keyboard
     * @return int[] Representing the new array with a value added
     * @throws IllegalArgumentException if kb is null
     * @throws IllegalArgumentException if myArray is null
     * @throws IllegalArgumentException if the length of myArray is less than one
     */
    public static int[] addNum(int[] myArray, final Scanner kb) {
        if (myArray == null || kb == null || myArray.length < 1)
            throw new IllegalArgumentException("bad params addNum");

        int[] copy = new int[myArray.length + 1];

        for (int i = 0; i < myArray.length; i++) {
            copy[i] = myArray[i];
        }

        System.out.print("Please enter the number you wish to add to the array: ");
        int lastNum = kb.nextInt();

        copy[copy.length - 1] = lastNum;

        return copy;

    }// end method

    /**
     * The deleteSingleValue method first prompts the user to enter a value that should be deleted.<br>
     * Next the method searches through the array to determine if that value was in the array.<br>
     * If the value is not in the array, a message "Value NOT found" is displayed and the old array
     * is returned.<br>
     * If the value is found a new array is made with the length being one less than the old array
     * being passed in.<br>
     * Next the values are copied over except the value that will be deleted.<br>
     * Finally the new array is returned<br>
     *
     * @param myArray Representing the old array of integers
     * @param kb      Representing the Scanner object to the keyboard
     * @return int[] Representing the new/old array
     * @throws IllegalArgumentException if kb is null
     * @throws IllegalArgumentException if myArray is null
     * @throws IllegalArgumentException if the length of myArray is less than one
     */
    public static int[] deleteSingleValue(int[] myArray, final Scanner kb) {
        if (myArray == null || kb == null || myArray.length < 1)
            throw new IllegalArgumentException("bad params deleteSingleValue");

        System.out.print("Please enter the value you wish to delete from the array: ");
        int toDelete = kb.nextInt();
        int indexOfTargetToDelete = 0;
        boolean targetFound = false;
        int[] copy = null;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == toDelete) {
                targetFound = true;
                indexOfTargetToDelete = i;
                copy = new int[myArray.length - 1];
                break;
            }
        }
        if (!targetFound) {
            System.out.println("Value not found!");
            return myArray;
        } else {
            for (int i = 0; i < copy.length; i++) {
                if (myArray[i] == toDelete) {
                    break;
                } else {
                    copy[i] = myArray[i];
                }
            }
            for (int i = indexOfTargetToDelete; i < copy.length; i++) {
                copy[i] = myArray[i + 1];
            }
        }
        return copy;
    }// end method

    /**
     * The printArray method prints the array in the following fashion<br>
     * [value, value, value, ..., value]<br>
     * You must write this code without calling any methods in the API from any class
     *
     * @param myArray Representing the array of integers to be printed
     * @throws IllegalArgumentException if myArray is null
     * @throws IllegalArgumentException if the length of myArray is less than one
     */
    public static void printArray(int[] myArray) {
        if (myArray == null || myArray.length < 1)
            throw new IllegalArgumentException("bad params deleteSingleValue");

        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            if (i != myArray.length - 1) {
                System.out.print(myArray[i]);
                System.out.print(", ");
            } else {
                System.out.print(myArray[i]);
            }
        }
        System.out.print("]\n");
    }// end printArray

}// end class