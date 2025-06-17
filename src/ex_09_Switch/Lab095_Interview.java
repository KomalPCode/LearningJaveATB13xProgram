package ex_09_Switch;

public class Lab095_Interview {
    public static void main(String[] args) {

        int a = 11;
        switch (-1){

            default:
                System.out.println("No match");
                break;

            case -1:
                System.out.println("exact match -1");
                break;

            case 9:
                System.out.println("no match 9");
                break;
        }

    }
}
