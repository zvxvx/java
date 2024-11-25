import computer.Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer newComputer = new Computer();
//        newComputer.setComputerCpu(32);
        System.out.println(newComputer.toString());
        System.out.println(newComputer.subtract(4,3));
        System.out.println(newComputer.add(4,3));
    }
}