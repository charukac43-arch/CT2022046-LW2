package Q4;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.print("Enter body weight (in pounds): ");
        double weight = sc.nextDouble();

         double calories = weight * 19;

        System.out.printf("Calories needed per day: %.2f\n", calories);
    }
}