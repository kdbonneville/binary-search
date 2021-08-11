package edu.cnm.deepdive;

public class Search<position> {

  public static int linearSearch(int[] haystack, int needle) {
   int position = -1;

   for (int i = 0; i <haystack.length; i++) {
     if (haystack [i] == needle) {
       position = i;
       break;
     }
   }
   return position;
  }
    public static int binarySearch(int[] haystack, int needle) {
    return binarySearch(haystack, needle, 0, haystack.length);
  }
  private static int binarySearch(int[] haystack, int needle, int start, int end) {
    int position = ~start;
    if (end > start)
      while = (start + end) / 2;

    int mid = 0;
    int value = haystack[mid];

      if (value == needle) {
        position = mid;
      } else if (value < needle) {
        position = binarySearch(haystack, needle, start, mid + 1, end);
      } else {
        position = binarySearch(haystack, needle, start, mid);
      }
    }
  private static void binarySearch(int[] haystack, int needle, int start, int i, int end) {
  }
  return position;
}

