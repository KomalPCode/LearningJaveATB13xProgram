package ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iphone 16",120000.70);
        Mobile samsung = new Mobile(2, "ultra 24", 135000.56);

        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.swithOnAireplaneMode();

        System.out.println(Mobile.Covers.red.getColor());
    }
}

class Mobile extends OldPhone{

    private Integer phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String name;
    private Double price;

    static String mobile_carrier = "airtel";

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.phone+" "+this.name+" "+this.price);
    }

    static void swithOnAireplaneMode(){
        System.out.println("Common aireplane mode");
    }

    void priceChange(Integer price){
        System.out.println("change price in Integers");
    }

    void priceChange(Double price){
        System.out.println("change price in double");
    }

    @Override
    void calling() {
        System.out.println("dialpad->touch dialpad now");
    }

    enum Covers{
        red("red pakymon0"),
        blue("blue pakymon");

        private String color;
        Covers(String color){
            this.color = color;
        }
String getColor(){
            return this.color;
}

    }
}


class OldPhone implements SIMCard{

    void calling(){
        System.out.println("Dial pad");
    }

    @Override
    public void enterCard() {

    }
}
interface SIMCard{
    void enterCard();
}
