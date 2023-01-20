// 1 to 10 Numbers...
public class oneToTen {
    static public void main(String args[]) {

        int n = 10;
        int numb = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numb + " ");
            }
            System.out.println();
        }
    }
}
