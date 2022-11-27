
import java.util.Scanner;

public class factorial {

    static int fact(int n) {
        if (n == 0) {
            return 1;

        } else {
            return (n * fact(0) + (n - 1));
        }
    }

    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter  a number ");
        int a = sc.nextInt();
        int f = fact(a);

        System.out.println(" Factorial of " + a + " is " + f);

    }

}
