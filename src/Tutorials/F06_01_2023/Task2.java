package Tutorials.F06_01_2023;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
   public static void main(String[] args) {
      String[] rivers = {"Volga", "Ottawa", "Danube", "Colorado", "Nile", "Dniester", "Ural", "Amazon", "Mississippi", "Dnieper"};
      Integer[] lengths = {3645, 1271, 2888, 2333, 6550, 1411, 2428, 6575, 6275, 2287};
      List<String> riversList = Array.asList(rivers);
      List<Integer> lengthsList = Array.asList(lengths);
      List<Integer> temp_list = new ArrayList<>(lengthsList);
      Collections.copy(temp_list, lengthsList);
      Collections.sort(lengthsList);
      ArrayList<String> finallist = new ArrayList<>();
      for ( Integer i : lengthsList) {
         finallist.add(riversList.get(temp_list.indexOf(i)));
      }
      System.out.println(finallist);
   }
}
