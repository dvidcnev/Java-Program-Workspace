import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert n: ");
        int n = sc.nextInt();
        int res=1;
        if ( n == 0 || n == 1 ) {
            res = 1;
        }
        else {
            for (int i=1; i<=n; i++) {
            res = res*i; }
        }
        System.out.println("Factorial of the number " + n + " is " + res);
    }
}
