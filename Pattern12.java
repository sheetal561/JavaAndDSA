//Number pyramid
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

class Pattern12{
    public static void main(String[] args) {
        int n=5;
        for(int i=0 ; i<n ; i++){
            for(int j=n-1 ; j>i ; j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i+1 ; k++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}