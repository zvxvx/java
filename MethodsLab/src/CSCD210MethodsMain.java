import java.util.Scanner;

public class CSCD210MethodsMain {
    public static void main(String[] args) {
        int ourNumber;
        Scanner kb = new Scanner(System.in);
        ourNumber = CSCD210Methods.readPosNum(kb);
        int ourChoice = CSCD210Methods.menu(kb);
        switch (ourChoice) {
            case 1:
                ourNumber = CSCD210Methods.readPosNum(kb);
                break;
            case 2:
                CSCD210Methods.oddEvenZero(ourNumber);
                break;
            case 3:
                CSCD210Methods.lightOrHeavy(ourNumber, kb);
                break;
            case 4:
                CSCD210Methods.printE(ourNumber);
                break;
            case 5:
                CSCD210Methods.printReverse(ourNumber);
                break;
            case 6:
                System.out.println("Goodbye!");
                break;
        }
    }
}