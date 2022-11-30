import java.util.Scanner;

public class palindrom {
    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        int rev = 0;
        int temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (rev == temp) {
            System.out.print(rev + " is a palindrom number ");
        } else {
            System.out.print(rev + " is not a palindrom number ");
        }
    }

}

//The palindrom number is a number that's look similar when they are swapped. 
