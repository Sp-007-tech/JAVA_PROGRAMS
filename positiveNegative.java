// Positive and Negative Number.

import java.util.Scanner;

public class positiveNegative {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();

        if(n>0){
            System.out.print("It is a positive number. ");
        }
        else{
            System.out.println("Its negative number.");
        }
    }
    
}
