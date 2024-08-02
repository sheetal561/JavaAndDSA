//Inverted half pyramid
// * * * *
// * * *
// * *
// *

public class Pattern4{
    public static void main(String[] args) {
        int n=4;
        int m=4;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print("* ");
            }
            m--;
            System.out.println();
        }
    }
}