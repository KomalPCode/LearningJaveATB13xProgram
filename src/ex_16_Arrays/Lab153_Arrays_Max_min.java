package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_min {

    public static void main(String[] args) {
        int[] array = {38, 56, 39, 80, 83, 40};
      //  Arrays.sort(array);
        // System.out.println(array[array.length-1]);
        int max_out = give_me_max(array);
        System.out.println(max_out);

    }
    static int give_me_max(int[] array)
    {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }

}
