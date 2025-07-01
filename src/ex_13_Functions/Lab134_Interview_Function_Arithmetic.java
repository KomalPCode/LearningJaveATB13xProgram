package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Interview_Function_Arithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number 1");
        int a = 0;
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();
        }else {
            System.out.println("Enter integer no.");
            //return;
            System.exit(0);
        }

        System.out.println(" Enter number 2");
        int b = 0;
        if(scanner.hasNextInt()) {
            b = scanner.nextInt();
        }else {
            System.out.println("Enter integer no.");
            //return;
            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }

    static int sum(int a, int b){
        return a+b;
    }

    static  int sub(int a, int b){
        return a-b;
    }

    static  int mul(int a, int b){
        return a*b;
    }

    static  int div(int a, int b){
        if (b == 0){
           // System.out.println("b can not be 0");
            //System.exit(0);
            throw new ArithmeticException("b can't be zero");
        }
        return a/b;
    }

    static  int mod(int a, int b){
        return a%b;
    }
}
