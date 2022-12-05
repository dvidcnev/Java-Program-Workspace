package Tutorials.F18_11_2022;

import java.util.Scanner;
public class Main3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String primorska = "University of Primorska";
        char[] B = new char[primorska.length()];
        String[] A = primorska.split( " ");
        for (int i=0; i<primorska.length(); i++) {
            B[i] = primorska.toUpperCase().charAt(i);
        }
        for (int i=0; i<B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
