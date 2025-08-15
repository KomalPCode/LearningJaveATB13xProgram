package ex_19_OOPs_Inheritance.single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {

        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase1 t2 = new TestCase1();
        t2.runningTC1();

        CommonToAll c1 = new CommonToAll();
        TestCase1 t3 = new TestCase1();
        CommonToAll c2 = new TestCase1(); // Dynamic Dispatch(when extends is used)
    }
}
