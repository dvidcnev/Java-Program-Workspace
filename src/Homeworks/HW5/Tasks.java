package Homeworks.HW5;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        double a = scan.nextInt();
        System.out.println("Input the second number");
        double b = scan.nextInt();
        double arithmetic = (a+b)/2;

        System.out.print("The greater number is: ");
        if ( a > b ) {
            System.out.print(a);
        }
        else {
            System.out.print(b);
        }
        System.out.println("\nThe arithmetic mean is: " + arithmetic);
    }
}
