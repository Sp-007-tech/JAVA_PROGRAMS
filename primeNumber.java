import java.util.Scanner;

public class primeNumber {
    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int count = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count = 1;
            }
        }

        if (count == 0) {
            System.out.print("is prime number. ");
        } else {
            System.out.print("is not a prime number. ");
        }
    }
}
