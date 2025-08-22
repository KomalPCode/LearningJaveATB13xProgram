package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;//Auto Boxing Primitive to Wrapper, automatically JVM will store the value

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2= 42;
        int v = a2;
        System.out.println(v);
    }
}
