package ex_05_TypeCastinhg;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total = course+GST;
        int total1 = course+(int)GST;
        int total4 = (int)(course+GST);
        System.out.println(total1);
        System.out.println(total4);

        float total2 = course+GST;
        float total3 = (float)course+GST;
        System.out.println(total2);
        System.out.println(total3);

    }
}
