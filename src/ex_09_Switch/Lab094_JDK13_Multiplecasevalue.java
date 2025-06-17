package ex_09_Switch;

public class Lab094_JDK13_Multiplecasevalue {
    public static void main(String[] args) {
        int code = 06;
        switch (code) {

            case 01, 02, 03:
                System.out.println("This is set 01");
                break;

            case 04, 05, 06:
                System.out.println("This is set 02");
                break;
        }
    }
}
