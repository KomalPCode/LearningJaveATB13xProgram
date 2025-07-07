package ex_15_StringBuffer_Builder_StringFunction;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Komal";
        String s1 = new String("Pawar");

        StringBuffer stringBuffer = new StringBuffer("KomalP");
        StringBuilder stringBuilder = new StringBuilder("PKomal");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
