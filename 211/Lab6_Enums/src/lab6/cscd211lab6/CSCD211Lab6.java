package lab6.cscd211lab6;

import java.io.*;
import java.util.*;
import lab1.cscd210utils.*;
import lab6.cscd211enums.*;
import lab6.cscd211classes.*;
import lab6.cscd211methods.*;
import lab6.cscd211comparators.*;



/**
 * The provided class used to test your code.  This file will
 * not be changed!<br>
 * 
 * <br>NOTE: FileUtils and SortUtils are provided in the jar file
 */
public class CSCD211Lab6
{
   public static void main(String [] args) throws Exception
   {
      
      File inf = null;
      int total, choice;
      Person [] myPeeps = null;
      Scanner kb = new Scanner(System.in), fin = null;
      
      inf = FileUtils.openInputFile(kb);
      fin = new Scanner(inf);
      total = FileUtils.countRecords(fin, 3);
      fin.close();
      
      fin = new Scanner(inf);
      myPeeps = CSCD211Lab6Methods.fillArray(fin, total); // you write
      SortUtils.selectionSort(myPeeps);
      fin.close();
      
      do
      {
         choice = CSCD211Lab6Methods.menu(kb);
         
         if(choice == 1)
            CSCD211Lab6Methods.printArray(myPeeps);
         
         else if(choice == 2)
         {
            Color toFind = CSCD211Lab6Methods.readColor(kb);
            CSCD211Lab6Methods.displayAll(toFind, myPeeps);
         }// end choice == 2
         
         else if(choice == 3)
            Arrays.sort(myPeeps, new ColorComparator());
         
         else if(choice == 4)
            Arrays.sort(myPeeps);
            
      }while(choice != 5);
   
   }// end main
      
}// end class 