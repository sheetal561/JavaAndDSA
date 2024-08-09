//Write a function that takes in age as input and returns if that person is eligible to vote or not.

import java.util.Scanner;

public class UAF{
    public boolean eligible(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        UAF a = new UAF();
        boolean eligible = a.eligible(age);
        if(eligible == true)
        System.out.println("The person is eligible to vote.");
        else
        System.out.println("The person is not eligible to vote.");

        sc.close();
    }
}
