// Hollow pattern

public class hollowPattern{
    public static void main(String args[]){
        int n = 10;
        int m = 15;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
