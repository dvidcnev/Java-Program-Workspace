package F18_11_2022;

import java.util.*;

public class Main4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
//        We enter the dimension of the array so A and B have the same length
        System.out.print("Insert dimension of array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
//        Be mindful of A's and B's lengths. They have the same length now so they can be used in the same loop
        for (int i=0; i<n; i++) {
            System.out.print("Enter number for array A[" + i + "]: ");
            A[i] = sc.nextInt();
            B[i] = rn.nextInt(100);
        }
//        Initialize the sum variables before the loop so they can be summed up with the array
        int sumA = 0;
        int sumB = 0;
        for (int i=0; i<n; i++) {
            sumA+=A[i];
            sumB+=B[i];
        }
        int sum = sumA + sumB;
//        System.out.println("Sum of array A is " + sumA + " and sum of array B is " + sumB);
        int maxA=0;
        int maxB=0;
//        We check the maximum of both arrays in this for loop
        for (int i=0; i<n; i++) {
            if ( A[i] > maxA ) {
                maxA=A[i];
            }
            if ( B[i] > maxB ) {
                maxB=B[i];
            }
        }
        System.out.println("Max of array A is " + maxA + " and max of array B is " + maxB);
//          First condition: if the max of array B is bigger than the max of A print the sum of both arrays
        if ( maxA < maxB ) {
            System.out.println("Sum of both arrays is " + sum);
        }
//          Second condition: if the max of Array A is bigger than the max of B print the elements of array A
        else if ( maxA > maxB ) {
            for (int i=0; i<n; i++) {
                System.out.println("B[" + i + "] = " + B[i]);
            }
        }
//        Third condition: if noone of the previous conditions work, print elements of array A in reverse
        else {
            for (int i=n-1; i>=0; i--) {
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
    }
}
