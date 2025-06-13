package ex_05_TypeCastinhg;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a =300;
//        byte b = a; //Implicit casting is not allowed

        byte b1 = (byte)a;
        System.out.println(b1);
    }
}
