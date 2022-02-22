/* Decompiler 9ms, total 226ms, lines 68 */
package lab4;

import java.util.Scanner;

public class MyTestClass {
   public static void main(String[] args) {
      String[] userVals = new String[5];
      String key = "";
      int i = false;
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter five string values: ");

      for(int i = 0; i < userVals.length; ++i) {
         userVals[i] = scnr.next();
      }

      System.out.println("\nEnter search key: ");
      key = scnr.next();
      System.out.println("Using selection sort to sort string in ascending order: ");
      Sorting<String> sorts = new Sorting();
      sorts.selectionSort(userVals);
      String[] var9 = userVals;
      int var8 = userVals.length;

      String vals;
      int var7;
      for(var7 = 0; var7 < var8; ++var7) {
         vals = var9[var7];
         System.out.print(vals + " ");
      }

      System.out.println("\nUsing reverse selection sort to sort string in descending order: ");
      sorts.reverseSelectionSort(userVals);
      var9 = userVals;
      var8 = userVals.length;

      for(var7 = 0; var7 < var8; ++var7) {
         vals = var9[var7];
         System.out.print(vals + " ");
      }

      System.out.println("\nUsing insertion sort to sort string in ascending order: ");
      sorts.insertionSort(userVals);
      var9 = userVals;
      var8 = userVals.length;

      for(var7 = 0; var7 < var8; ++var7) {
         vals = var9[var7];
         System.out.print(vals + " ");
      }

      System.out.println("\nUsing reverse insertion sort to sort string in descending order: ");
      sorts.reverseInsertionSort(userVals);
      var9 = userVals;
      var8 = userVals.length;

      for(var7 = 0; var7 < var8; ++var7) {
         vals = var9[var7];
         System.out.print(vals + " ");
      }

      sorts.selectionSort(userVals);
      Searching<String> search = new Searching();
      System.out.println("\nUsing Linear search to search for " + key + " key:\n" + search.linearSearch(userVals, key));
      System.out.println("Using Binary search to search for " + key + " key:\n" + search.binarySearch(userVals, key));
   }
}
