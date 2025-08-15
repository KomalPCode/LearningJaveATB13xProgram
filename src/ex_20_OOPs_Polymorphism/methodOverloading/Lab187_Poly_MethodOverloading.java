package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int r1 = m1.add(3,4);
        int r2 = m1.add(3, 4, 6);
        double r3 = m1.add(3.14, 4.56);
        String r4 = m1.add("Komal", "Pawar");
    }
}

class MathOperations{

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a, String b){
        return a+b;
    }
}
