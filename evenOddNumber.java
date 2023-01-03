// Even and Odd Numbers

import java.util.Scanner;

public class evenOddNumber {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int a =sc.nextInt();

        if(a%2 == 0){
            
            System.out.println("Its a even number");
            
        }else{
            
            System.out.println("Its not a even number");
        }
    }
}
