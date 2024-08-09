//Enter 3 numbers from the user & make a function to print their average

import java.util.Scanner;

public class Average {
    public float averageCalculate(int a, int b, int c){
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average av = new Average();
        float value = av.averageCalculate(a, b, c);
        System.out.println("Average of " + a + ", " + b + " and " + c + " is " + value);
        sc.close();
    }
}
