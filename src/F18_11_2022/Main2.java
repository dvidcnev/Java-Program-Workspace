package F18_11_2022;

import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String primorska = "University of Primorska";
//        char[] B = new char[primorska.length()];
        String[] A = primorska.split( " ");
        for (int i = 0; i<A.length; i++) {
            System.out.println(A[i]);
        }
//        for (int i=0; i<B.length; i++) {
//            System.out.println(B[i]);
//        }
    }
}
