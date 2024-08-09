//Write a program to print Fibonacci series of n terms where n is input by user

import java.util.Scanner;

public class Fibbonacci {
    public static void print(int n){
        int sum=0;
        int a=0 ; 
        int b=1 ;

        System.out.println(a);
        System.out.println(b);
        while(n-2>0){
            sum = a+b;
            a = b;
            b = sum;
            n--;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the value of n: ");
        print(n);

        sc.close();
    }
}
