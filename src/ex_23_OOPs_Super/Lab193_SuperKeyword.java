package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}

class Vehicle{

    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parameterised Constructor");
    }

    //Method Overloading
    void message() {
        System.out.println("Type 1");
    }

    void message(int a){
        System.out.println("Type 2");
        }

        int message(String a){
            System.out.println("Type 4");
            return 0;
        }

        void display(){
            System.out.println("Vehicle Parent");
        }
}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car(){
    super();
    }
    Car(int a){
    super(10);
        //this();
    }

    @Override
    void display() {
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        System.out.println("Hi Override");
    }
}