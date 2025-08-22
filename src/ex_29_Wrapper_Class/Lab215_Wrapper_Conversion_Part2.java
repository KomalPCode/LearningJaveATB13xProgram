package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {

        //String to Wrapper
        String num = "10";
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        //Wrapper to String
        System.out.println(a.toString());

        //String to Primitive
        int aa = Integer.parseInt(num);

        //Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
    }

}
