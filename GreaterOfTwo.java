//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class GreaterOfTwo {
    public int greater(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        GreaterOfTwo got = new GreaterOfTwo();
        int value = got.greater(a, b);
        System.out.println(value + " is greater.");

        sc.close();
    }
}
