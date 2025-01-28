package lab3.cscd211lab3;

import java.util.*;
import lab3.cscd211comparators.*;
import lab3.cscd211inheritance.*;
import lab3.cscd211comparators.NameComparator;

/**
 * This file contains the main() method used to run the program.
 * DO NOT CHANGE THIS FILE.
 */
public class CSCD211Lab3
{
   public static void main(String [] args)
   {
      ArrayList<Employee>myList = new ArrayList<Employee>();
      myList.add(new Programmer("Emily Johnson", 40000, 20000, true));
      myList.add(new Programmer("John Donne", 45000, 20000, false));
      myList.add(new Accountant("Liam Smith", 100000, 0, 50.00));
      myList.add(new Accountant("Sophia Martinez", 75000, 0, 150.00));
      myList.add(new Lawyer("Emily Dickinson", 150000, 30000, 25));
      myList.add(new Lawyer("Ezra Pound", 170000, 20000, 125));

      System.out.println("Employee List");
      for(Employee e : myList)
         System.out.println(e);

      System.out.println();
               
   
      System.out.println("Employee Report");         
      for(Employee e : myList)
         e.report();
      
      System.out.println();
      
      Collections.sort(myList);  // uses compareTo() in Employee to sort the list
      
      System.out.println("Employee List: Natural Order");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();
      
      
      Collections.sort(myList, new SalaryComparator());  // uses salary to sort the list
      
      System.out.println("Employee List by Salary");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();
      
      Collections.sort(myList, new NameComparator());    // uses names to sort the list
      
      System.out.println("Employee List by Name");
      for(Employee e : myList)
         System.out.println(e.getType() + " - " + e.getName() + " - " + e.getSalary());

      System.out.println();


    
   }//end main
   
}// end class