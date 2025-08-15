package ex_19_OOPs_Inheritance.Hierarchical;

public class Lab185_Hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        Pramod p1 = new Pramod();
        p1.home();
    }
}
class Father{
        void home(){
            System.out.println("3BHK");
        }
}

class Pramod extends Father{
    void h2(){
        System.out.println("h2-Pramod");
    }
}
class Lucky extends Father{
    void l2(){
        System.out.println("Lucky");
    }
}
