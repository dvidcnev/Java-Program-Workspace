package F02_12_2022;

import java.util.*;
public class Tasks {
    public static void main (String[] args) {
        Task3.main();
        System.out.println("Hi!");
    }
}

class Task3 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println(fibrec(i)+" ");
        }
    }
    public static int fibrec(int n) {
        if (n<=0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibrec(n-1)+fibrec(n-2);
        }
    }
}