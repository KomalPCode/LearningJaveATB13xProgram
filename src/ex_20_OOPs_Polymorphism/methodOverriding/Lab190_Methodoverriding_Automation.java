package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab190_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();
    }

}

class CommonToAll{

    void openBrowser(){
        System.out.println("Starting IE Browser");
    }
}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("starting chrome browser");
    }
}
