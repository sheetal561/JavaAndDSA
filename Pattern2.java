//Hollow Rectangle
// * * * * *
// *       *
// *       *
// * * * * *

class Pattern2{
    public static void main(String[] args){
        int m = 4;
        int n = 5;
         for(int i=0; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i == 0 || i == m-1 || j == 0 || j == n-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
         }
    }
}