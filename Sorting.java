/* Decompiler 15ms, total 85ms, lines 66 */
package lab4;

public class Sorting<T> {
   public void selectionSort(Comparable<T>[] list) {
      for(int index = 0; index < list.length - 1; ++index) {
         int min = index;

         for(int scan = index + 1; scan < list.length; ++scan) {
            if (list[scan].compareTo(list[min]) < 0) {
               min = scan;
            }
         }

         Comparable<T> temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }

   }

   public void insertionSort(String[] list) {
      for(int index = 1; index < list.length; ++index) {
         Comparable<String> key = list[index];

         int position;
         for(position = index; position > 0 && key.compareTo(list[position - 1]) < 0; --position) {
            list[position] = list[position - 1];
         }

         list[position] = (String)key;
      }

   }

   public void reverseSelectionSort(Comparable<T>[] list) {
      for(int index = 0; index < list.length - 1; ++index) {
         int max = index;

         for(int scan = index; scan < list.length; ++scan) {
            if (list[scan].compareTo(list[max]) > 0) {
               max = scan;
            }
         }

         Comparable<T> temp = list[max];
         list[max] = list[index];
         list[index] = temp;
      }

   }

   public void reverseInsertionSort(Comparable<T>[] list) {
      for(int index = 1; index < list.length; ++index) {
         Comparable<T> key = list[index];

         int position;
         for(position = index; position > 0 && key.compareTo(list[position - 1]) > 0; --position) {
            list[position] = list[position - 1];
         }

         list[position] = key;
      }

   }
}
