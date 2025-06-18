package ex_12_DoWhile;

import java.util.Scanner;

public class CP_checkVowel_using_Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char alphabet = scanner.next().toLowerCase().charAt(0);

        switch(alphabet){

            case 'a', 'e', 'i', 'o','u' -> System.out.println("It is a vowel");

            default -> System.out.println("It is a consonant");
        }

    }
}
