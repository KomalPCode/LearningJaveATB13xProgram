package ex_17_OOPs;

public class Lab167_OOPs_P2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();
    }
}

class Student{
    String name;

    Student(){
        System.out.println("DC");
    }

    void sleep(){
        System.out.println("Hi");
    }
}
