// half pyramid
// *
// * *
// * * *
// * * * *

class Pattern3{
    public static void main(String[] args) {
        int n=4;
        int m=1;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print("* ");
            }
            m++;
            System.out.println();
        }
    }
}