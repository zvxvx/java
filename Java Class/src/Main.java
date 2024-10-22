import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Binary Search
        // Array must be sorted first
        boolean tFound = false;
        int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // set target, hi, lo, and mid
        int t = 4;
        int l = 0;
        int h = myArray.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (myArray[m] == t) {
                System.out.println("Target found at: " + m);
                tFound = true;
                break;
            } else if (myArray[m] < t) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        if (!tFound) {
            System.out.println("Target not found.");
        }
    }
}