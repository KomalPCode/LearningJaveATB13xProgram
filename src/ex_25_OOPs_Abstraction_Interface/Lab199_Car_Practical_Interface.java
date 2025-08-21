package ex_25_OOPs_Abstraction_Interface;

public class Lab199_Car_Practical_Interface {
    public static void main(String[] args) {
        car tesla = new car();
        tesla.drive();
    }
}

class car implements Engine1, Breaks{

    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }
    @Override
    public void applyBreak() {
        System.out.println("apply breaks");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine");
    }

    @Override
    public void money() {
        System.out.println("Son has to buy everything");
    }
}

interface Breaks{
    void applyBreak();
    void money();
}

interface Engine1{
    void startEngine();
    void money();
    void stopEngine();

    default void completeF1(){
        System.out.println("Default complete function");
    }
}
