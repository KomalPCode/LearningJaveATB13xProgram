package ex_19_OOPs_Inheritance.multilevel_Inheritance;

public class Lab183_Multilevel {
    public static void main(String[] args) {
        Son amit = new Son();
    //    Son s1 = new Father();

        GrandFather g1 = new Son();//Dynamic dispatch
        g1.gf();
        g1.home();//Home of son will be call because object is of son
    }
}
