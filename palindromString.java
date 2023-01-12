// Palindrom String 

import java.util.Scanner;
public class palindromString {
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");

        String str = sc.nextLine();

        String rev = " "; 

        String temp = " ";


        for(int i= str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        
        if(temp.equals(rev)){
            System.out.print(rev + " is a palindrom string.");            
        }else{
            System.out.print(rev + " is not a palindrom string.");
        }
    }
}
