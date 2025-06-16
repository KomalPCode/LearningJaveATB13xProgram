package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("Yes you can go to Goa");
        }
        else {
            System.out.println("you can not go to Java");
        }
    }
}
