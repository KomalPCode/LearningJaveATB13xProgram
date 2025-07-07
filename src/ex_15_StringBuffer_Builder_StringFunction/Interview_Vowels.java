package ex_15_StringBuffer_Builder_StringFunction;

public class Interview_Vowels {
    public static void main(String[] args) {

        String input = "Java Program to count Vowels and Consonants";
        int vowels = 0;
        int consonant = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }else {
                consonant++;
            }

        }
        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Number of Consonant : " + consonant);
    }

}
