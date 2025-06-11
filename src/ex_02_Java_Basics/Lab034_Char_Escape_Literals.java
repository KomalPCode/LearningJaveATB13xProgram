package ex_02_Java_Basics;

public class Lab034_Char_Escape_Literals {

    public static void main(String[] args) {
        char c1 = '1';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("komalpawar");
        System.out.println("komal"+"\n"+"pawar");
        System.out.println("komal"+"\t"+"pawar");
        System.out.println("komal"+"\b"+"pawar");
        System.out.println("komal"+"\r"+"pawar");

        char c11 = '\u1F60';
    }


}
