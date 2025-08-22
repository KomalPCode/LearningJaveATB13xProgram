package ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }

}
class A{
    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi...I am IIB");
        System.out.println("If you want to execute or call something when object is created");
    }
    {
        System.out.println("I am IIB2");
    }
    static{
        System.out.println("Static block");
    }
}
