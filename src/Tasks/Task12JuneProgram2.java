package Tasks;
/*
1 TERNARY OPERATOR PROGRAMS

        🔹 Program 2: Check Even or Odd.

Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;
*/

public class Task12JuneProgram2 {
    public static void main(String[] args){

        int num = 20;

        String checkEvenOdd = (num % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(checkEvenOdd);
    }
}
