package ex_13_Functions;

public class Lab130_Simple_Method {

    public static void main(String[] args) {
        f1();
        return_int();
        return_boolean();
        return_float_pi_value();
        return_long();
        return_string();

    }

    static void f1(){
        System.out.println("No Return");
    }

    static int return_int(){
        System.out.println("This is returning int");
        return 10;
    }

    static boolean return_boolean(){
       return true;
    }

    static float return_float_pi_value(){
       return 3.14f;
    }

    static long return_long(){
        return 10l;
    }

    static String return_string(){
        return "Komal";
    }


}
