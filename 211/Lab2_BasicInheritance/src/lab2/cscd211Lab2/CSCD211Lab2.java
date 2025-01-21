package lab2.cscd211Lab2;

import lab2.cscd211Comparator.ManufacturerComparator;
import lab2.cscd211Inheritance.CarEngine;
import lab2.cscd211Inheritance.Engine;
import lab2.cscd211Inheritance.TruckEngine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This lab is about simple inheritance.
 * DO NOT change this class.
 */
public class CSCD211Lab2 {
    /**
     * The main method used to test the basic inheritance.
     *
     * @param args Representing the command line arguments
     * @throws Exception If there are any Exceptions generated
     */
    public static void main(String[] args) throws Exception {
        ArrayList<Engine> myList = new ArrayList<Engine>(5);
        myList.add(new CarEngine("General Motors", 137));
        myList.add(new TruckEngine("Ford", 250, true));
        myList.add(new CarEngine(134, "Toyota"));
        myList.add(new CarEngine("Ford", 134));
        myList.add(new TruckEngine("Toyota", 200, false));

        for (Engine e : myList) {
            System.out.println(e + " output of " + e.calcOutput());
        }// end for
        System.out.println();

        Collections.sort(myList);
        for (Engine e : myList) {
            System.out.println(e);
        }
        System.out.println();


        Collections.sort(myList, new ManufacturerComparator());
        for (Engine e : myList) {
            System.out.println(e);
        }
        System.out.println();

    }// end main

}// end class
