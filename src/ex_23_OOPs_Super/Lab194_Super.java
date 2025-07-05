package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
        cat.test();
    }
}

class God{
    public int gold = 100;
    void sound(){
        System.out.println("GOD");
    }

    God(){
        System.out.println("GOD DC!");
    }
}

class Animal extends God{
    @Override
    void sound() {
        super.sound();
    }
    Animal(){
        super();
    }
    void test(){
        System.out.println(super.gold);
    }
}
