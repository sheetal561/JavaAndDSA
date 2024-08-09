//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class SumOfOddNum {
    public int sum(int n){
        int sum = 0;
        while(n>0){
            if(n%2 == 0){

            }
            else{
                sum += n;
            }
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        SumOfOddNum odd = new SumOfOddNum();
        int value = odd.sum(num);
        System.out.println("The sum of odd numbers till " + num + " is " + value);
        
        sc.close();
    }
}
