package ex_27_Static;

public class Lab208_REAL {
    public static void main(String[] args) {

    }
}
class ATB{

    static{
        System.out.println("Load the class, I will execute");
    }
    {
        System.out.println("IIB-this is called when object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;

    static String courseName = "ATB13X";
    static String MentorName = "Pramod";

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined");
    }
    void howTheyAssignment(){
        System.out.println("It is different");
    }
}