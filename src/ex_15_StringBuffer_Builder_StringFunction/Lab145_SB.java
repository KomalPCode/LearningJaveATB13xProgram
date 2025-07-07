package ex_15_StringBuffer_Builder_StringFunction;

public class Lab145_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Komal");
        stringBuffer.append(" Pawar");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
