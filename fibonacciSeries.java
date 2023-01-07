// Fibonacci Series

import java.util.Scanner;

public class fibonacciSeries {

    static void fab(int n) {
        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2);

        for (int i = 1; i <= n; i++) {
            n3 = n1 + n2;

            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;
        }
    }

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int n = sc.nextInt();

        fab(n);
    }

}
