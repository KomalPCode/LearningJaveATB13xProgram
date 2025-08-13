package ex_17_OOPs;

public class Person {

    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    void walk() {
        System.out.println("walking");
    }

    void eat(String food) {
        System.out.println("eating");
    }

    String sleep() {
        System.out.println("sleeping");
        return null;
    }

    String food(int a) {
        System.out.println("foody");
        return null;
    }
}
