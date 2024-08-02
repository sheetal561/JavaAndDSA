// butterfly pattern 
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * * 
// * * *     * * *
// * *         * *
// *             *

public class Pattern10{
    public static void main(String[] args) {
        int n=4 ;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("* ");
            } 
            for(int l=0 ; l<2 ; l++){
                for(int k=n-1 ; k>i ; k--){
                    System.out.print("  ");
                }
            }
            for(int j=0 ; j<i+1 ; j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
        for(int i=0 ; i<n ; i++){
            for(int j=n ; j>i ; j--){
                System.out.print("* ");
            }
            for(int l=0 ;l<2 ; l++){
                for(int k=0 ; k<i ; k++){
                    System.out.print("  ");
                }
            }
            for(int j=n ; j>i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}