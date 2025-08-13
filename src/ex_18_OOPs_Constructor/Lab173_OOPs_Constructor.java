package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }
}

class Baby{
    String name;

    Baby(){
        System.out.println("I am default constructor");
        System.out.println("your aadhar no. is ready");
    }

    void cry(){
        System.out.println("cry");
    }

    void sleep(){
        System.out.println("sleep");
    }

    void eat(){
        System.out.println("eat");
    }
}
