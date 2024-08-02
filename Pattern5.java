// Inverted half pyramid (rotated by 180 degree)
//       *
//     * *
//   * * *
// * * * *

public class Pattern5 {
    public static void main(String[] args) {
        int n=4;
        int m=4;
        int o=1;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m-1 ; j++){
                System.out.print("  ");
            }
            m--;
            for(int k=0 ; k<o ; k++){
                System.out.print("* ");
            }
            o++;
            System.out.println();
        }
    }
}
