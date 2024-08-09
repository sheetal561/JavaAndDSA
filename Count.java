// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int num;
        int zeroCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        while(true){
            System.out.println("Do you want to stop(yes-> stop  or no-> continue)");
            String stop = sc.next();
            if(stop.equals("yes")){
                break;
            }
            else if(stop.equals("no")){
                System.out.println("Enter the number: ");
                num = sc.nextInt();
                if(num == 0)
                zeroCount++;
                else if(num > 0)
                positiveCount++;
                else if(num < 0)
                negativeCount++;
                continue;
            }
        }
        System.out.println("Count of zero is: " + zeroCount);
        System.out.println("Count of positive number is: " + positiveCount);
        System.out.println("Count of negative number is: " + negativeCount);
        sc.close();
    }
}
