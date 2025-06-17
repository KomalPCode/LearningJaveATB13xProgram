package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter browser which you want to start");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser){

            case "chrome":
                System.out.println("Chrome is used");
                break;
            case "mozilla":
                System.out.println("Mozilla is used");
                break;
        }

    }
}
