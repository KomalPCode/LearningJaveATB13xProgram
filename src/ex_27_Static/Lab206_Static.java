package ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(ref1.a);
        System.out.println(A.b);
        System.out.println(ref2.a);

        System.out.println(ref1.b);
        System.out.println(ref2.b);

        ref1.displayvalue();
        ref2.displayvalue();

        A.staticmethod();
    }
}

class A{
    int a;
    static int b = 20;

    A(int a){
        this.a = a;
    }

    void displayvalue(){
        System.out.println(this.a);
        System.out.println(b);//static variable in instance method is allowed
    }

    static void staticmethod(){
        System.out.println("I will be called when class is loaded");
      //  System.out.println(this.a); // Static methods can not access non static variables
    }

}
