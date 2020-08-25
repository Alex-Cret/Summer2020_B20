package day09_If_Statement;

public class WarmUpTask2 {

    /*
     write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic

     */
    public static void main(String[] args) {

        int Grade=50;

        if (Grade>90){
            System.out.println("Excelent");
        }
        if (Grade>70 && Grade<90) {
            System.out.println("Good");
        }
        if (Grade>60 && Grade<70){
            System.out.println("Pass");
        }

        if (Grade<60){
            System.out.println("Fail");
        }

    }
}
