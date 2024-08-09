//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class Power {
    public int pow(int x, int n){
        int product = 1;
        while(n>0){
            product *= x;
            n--;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        Power p = new Power();
        System.out.println(x + " raise to the power " + n + " is " + p.pow(x, n));
        sc.close();
    }
}
