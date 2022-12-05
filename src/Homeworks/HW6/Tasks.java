package Homeworks.HW6;
import java.util.*;


public class Tasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter k:");
        int k = scan.nextInt();
        System.out.println("Result: " + binomial(n, k));

        System.out.print("Coefficient array: ");
        coefficientarr(n,k);


        System.out.println("\nPascal triangle:");
        for (int i=0; i<n+1; i++) {
            if ( i == 0 ) {
                System.out.println("1");
                continue;
            }
            else {
                for (int j = 0; j < i+1; j++) {
                    System.out.print(binomial(i, j) + " ");
                }
                System.out.println("");
            }
        }
    }
    public static int factoriel(int n) {
        if ( n <= 1 ) {
            return 1;
        }
        else {
            return n*factoriel(n-1);
        }
    }
    public static int binomial(int n, int k) {
        return factoriel(n)/(factoriel(k)*factoriel(n-k));
    }
    public static void coefficientarr(int n, int k) {
        for (int i=0; i<=k; i++) {
            System.out.print(binomial(n, i)+" ");
        }
    }
}
