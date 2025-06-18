package Tasks;

import java.util.Scanner;

public class Task_18_June {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");

      char alphabet = scanner.next().toLowerCase().charAt(0);
      //char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a')
        {
            System.out.println("It is a Vowel");
        } else if (alphabet == 'e') {
            System.out.println("It is a Vowel");
        } else if (alphabet == 'i') {
            System.out.println("It is a Vowel");
        }else if (alphabet == 'o') {
            System.out.println("It is a Vowel");
        } else if (alphabet == 'u') {
            System.out.println("It is a Vowel");
        }else {
            System.out.println("It is a consonant");
        }

    }
}
