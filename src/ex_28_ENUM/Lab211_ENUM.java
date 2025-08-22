package ex_28_ENUM;

public class Lab211_ENUM {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.BLUE.getHexCode());
        System.out.println(Colors.YELLOW.getHexCode());

        System.out.println((APIURLs.vwo.getUrl()));
        System.out.println(APIURLs.katalon.getUrl());
        System.out.println(APIURLs.google.getUrl());
    }
}
