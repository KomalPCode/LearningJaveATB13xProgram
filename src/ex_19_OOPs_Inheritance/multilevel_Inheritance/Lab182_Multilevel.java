package ex_19_OOPs_Inheritance.multilevel_Inheritance;

public class Lab182_Multilevel {

    public static void main(String[] args) {
        GrandFather gf = new Father();
        gf.gf();

        System.out.println("--");

        Father f1 = new Father();
        f1.f1();
        f1.gf();

        System.out.println("--");

        Son s1 = new Son();
        s1.s();
        s1.f1();
        s1.gf();

    }
}
