// Overloadig in Java
public class overloading{

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return ((a+b)+c);
    }

    static float sum(float a , float b){
        return a+b;
    }

    static public void main(String args[]){
        System.out.println(sum(9,6));
        System.out.println(sum(6,9,6));
        System.out.println(sum(69.6f,69.6f));
    }
}
