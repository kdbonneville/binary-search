package edu.cnm.deepdive;

public class Search {

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

}
