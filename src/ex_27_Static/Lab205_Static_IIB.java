package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
        System.out.println(P.a);
        P p1 = new P();
        P p2 = new P();
        p1.a = 12;
        System.out.println(P.a);
        System.out.println(p1.a);
      //  System.out.println(P.b);
        p1.b=24;
        p2.b=34;
        System.out.println(p1.b);
        System.out.println(p2.b);

    }


}

class P{
    static int a = 10;
    int b = 15;
}
