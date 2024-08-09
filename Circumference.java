//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Circumference {
    public float circumference(float radius){
        float circum = 2 * (3.14f) * radius;
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float radius = sc.nextFloat();

        Circumference obj = new Circumference();
        System.out.println("The circumference of circle is " + obj.circumference(radius));

        sc.close();
    }
}
