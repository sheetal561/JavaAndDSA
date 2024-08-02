//Floyd's triangle
//  1 
//  2  3
//  4  5  6
//  7  8  9 10
// 11 12 13 14 15

class Pattern8{
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        for(int i=0 ; i<n ; i++){
            for(int j=1 ; j<=i+1 ; j++){
                System.out.printf("%2d ",m);
                m++;
            }
            System.out.println();
        }
    }
}