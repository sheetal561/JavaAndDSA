import java.util.Scanner;

public class GCD {
    public static int greatestCommonDivisor(int a, int b){
        int min;
        int gcd = 1;
        if(a>b)
        min = b;
        else 
        min = a;
        for(int i=1 ; i<=min ; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The greatest common divisor among " + a + " and " + b + " is " + greatestCommonDivisor(a, b));

        sc.close();

    }
}
