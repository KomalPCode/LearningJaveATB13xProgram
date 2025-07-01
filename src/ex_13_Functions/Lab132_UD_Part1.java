package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        wp_wr_greet();
        String String1  = wip_wr_greet_with_hello();
        System.out.println(String1);
        wip_wr_details("Komal", 33, 10l);
        int result = sum_of_number(110, 200);
        System.out.println(result);
    }

    // Type 1 : Without parameters and without return type
    static void wp_wr_greet(){
        System.out.println("--Without parameters and without return type--");
        System.out.println("Hi....Good Morning");
    }
    // Type 2 : Without parameters but with return type
    static String wip_wr_greet_with_hello(){
        System.out.println("--Without parameters but with return type--");
        return "hi...how are you";
    }
    // Type 3 : With parameters but without return type
    static void wip_wr_details(String name, int age, double salary){
        System.out.println("--With parameters but without return type--");
        System.out.println("Your name is : " + name + "\nage is : " + age + "\nsalary is : " + salary );
    }
    // Type 4 : With parameters and with return type
    static int sum_of_number(int a, int b){
        System.out.println("--With parameters and with return type--");
        return a+b;
    }

}
