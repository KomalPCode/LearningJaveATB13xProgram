package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_Left_Triangle_2D {
    public static void main(String[] args) {

        System.out.println("Enter the n eg. n=3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
