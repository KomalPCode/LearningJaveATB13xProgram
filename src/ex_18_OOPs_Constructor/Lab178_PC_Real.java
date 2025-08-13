package ex_18_OOPs_Constructor;

public class Lab178_PC_Real {
    public static void main(String[] args) {
        Person P1 = new Person("Amit", 988156734, "nagpur");
        System.out.println(P1.name);
    }
}

class Person{

    String name;
    long phone;
    String address;

    Person(String name_user, long phone_user, String address_user){
        this.name=name_user;
        this.phone=phone_user;
        this.address=address_user;

    }
}
