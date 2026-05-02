package Q2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
         double cm = sc.nextDouble();

        double inches = cm / 2.54;

        int feet = (int)(inches / 12);
         double remainingInches = inches % 12;

        System.out.println("Feet: " + feet);
        System.out.printf("Inches: %.2f\n", remainingInches);
    }
}