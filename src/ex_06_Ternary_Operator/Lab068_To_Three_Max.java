package ex_06_Ternary_Operator;

public class Lab068_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3 ;
        System.out.println(max
        );
    }
}
