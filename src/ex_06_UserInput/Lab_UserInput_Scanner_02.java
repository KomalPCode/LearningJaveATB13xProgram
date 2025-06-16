package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String input");
        String string_input = scanner.next();
        System.out.println(string_input);

        System.out.println("Enter Integer input");
        int inter_input = scanner.nextInt();
        System.out.println(inter_input);

        System.out.println("Enter Double input");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);
    }
}
