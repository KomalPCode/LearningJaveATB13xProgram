package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2d_Multiplication_Table {
    public static void main(String[] args) {

        System.out.println("Enter the n eg. n=3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i*j + " | ");
            }
            System.out.println();

        }
    }
}
