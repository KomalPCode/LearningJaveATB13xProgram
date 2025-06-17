package ex_11_While;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Program\nEnter the number!");
        if (!scanner.hasNextInt()) {
            System.out.println("That's not a valid integer");
            return;
        }
        int number = scanner.nextInt();

        long factorial = 1;
        if (number < 0) {
            System.out.println("Negative factorial is not allowed");
            return;
        }
        if (number <= 0) {
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial is ->" + factorial);
    }
}
