/* Decompiler 10ms, total 83ms, lines 39 */
package lab4;

public class Searching<T> {
   public String linearSearch(String[] list, String target) {
      int index = 0;
      boolean found = false;

      while(!found && index < list.length) {
         if (list[index].equals(target)) {
            found = true;
         } else {
            ++index;
         }
      }

      return found ? "Item found at index " + index : null;
   }

   public Comparable<String> binarySearch(Comparable<String>[] list, Comparable<String> target) {
      int min = 0;
      int max = list.length - 1;
      int mid = 0;
      boolean found = false;

      while(!found && min <= max) {
         mid = (min + max) / 2;
         if (list[mid].equals(target)) {
            found = true;
         } else if (target.compareTo((String)list[mid]) < 0) {
            max = mid - 1;
         } else {
            min = mid + 1;
         }
      }

      return found ? "Item found at index " + mid : null;
   }
}
