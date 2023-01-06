import java.util.*;
import java.util.ArrayList;

package Tutorials.F06_01_2023;

public class Task1 {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      ArrayList<String> StringList = new ArrayList<>();
      StringList.add("Hello");
      System.out.println(StringList); //list... not element of the list
      StringList.add(0, "World");
      System.out.println(StringList);
      StringList.remove(0);
      
      for ( int i=0; i< StringList.size(); i++ ) {
         System.out.print(StringList.get(i) + " ");
      }
      
      ArrayList<Integer> arr = CreateL(5);
      oby5(arr);
   }
   
   public static ArrayList<Integer> Create(int n) {
      ArrayList<Integer> list = new ArrayList<>(n);
      for ( int i=0; i<n; i++) {
         list.add(scan.nextInt());
      }
      return list;
   }
   
   public static void oby5(ArrayList<Integer> list) {
      ArrayList<Integer> newlist = new ArrayList<>();
      for ( int i=0; i<list.size(); i++) {
         if ( list.get(i)%5==0) {
            newlist.add(list.get(i));
         }
      }
      Collections.sort(newlist);
   
      System.out.println(newlist);
   }
}
