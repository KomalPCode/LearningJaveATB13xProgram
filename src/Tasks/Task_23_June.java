package Tasks;

import java.util.Scanner;

public class Task_23_June {

    public static void main(String[] args) {
      /* My Solution

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String s1 = scanner.next();
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--)
        {
            s2 = s2 + s1.charAt(i);
          //  System.out.println(s2);
        }
        System.out.println(s1);
        System.out.println("----");
        System.out.println(s2);
        if (s1.equals(s2))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.next();
        String reversed_string = reverseString(input);
    }
    static String reverseString(String userInput){
        String reverse = "";

        for (int i = userInput.length()-1; i >= 0 ; i--) {
         reverse = reverse + userInput.charAt(i) ;
        }
        return reverse;
    }
}
