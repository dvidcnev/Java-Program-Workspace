package Homeworks.HW4;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = scan.next();
        System.out.println("Enter Surname:");
        String surname = scan.next();
        String[] namearr = name.split("");
        String[] surnamearr = surname.split("");
        System.out.println("");
        printname(namearr);
        System.out.println("");
        printname(surnamearr);
    }
    public static void printname(String[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if ( i == j ) {
                    System.out.print(arr[i]);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
