package Tasks;

/*
✅ 1 TERNARY OPERATOR PROGRAMS

🔹Program 3: Grade Calculation Using Nested Ternary

                   Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
 */

// Rough logic                                  Code Logic
// marks = 90+ --> A+                                 marks >= 90
// marks = 75 to 89 --> A                       75 <= marks < 90
// marks = 60 to 74--> B                        60 <= marks < 75
// marks = 40 to 59--> C                        40 <= marks < 60
// marks < 40 --> Fail                                marks < 40

public class Task12JuneProgram3 {
    public static void main(String[] args){

        int marks = 100;
        String grade = (marks >= 90) ? "Grade is A+" :
                (marks >= 75 && marks <= 89) ? "Grade is A" :
                        (marks >= 60 && marks <= 74) ? "Grade is B" :
                                (marks >= 40 && marks <= 59) ? "Grade is C" : "Fail";
        System.out.println(grade);
    }

}
