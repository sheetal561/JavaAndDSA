//Solid rhombus
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

public class Pattern11{
    public static void main(String[] args) {
        int n=5 ;
        for(int i=0 ; i<n ; i++){
            for(int j=n ; j>i ; j--){
                System.out.print("  ");
            }
            for(int k=0 ; k<n ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}