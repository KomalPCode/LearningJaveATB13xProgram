package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {

        int[] marks = { 20, 40, 30, 60, 90, 50};
        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}
