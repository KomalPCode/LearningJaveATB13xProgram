package ex_28_ENUM;

public class Lab210_ENUM {
    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(Project_Names.Google);
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_Names{
    Google, restassured, katalon, vwo
}
