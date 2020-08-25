package day11_NestedIf_Turnary;

 /*
            precondition:minimum salary of 30k
            sub condition: minimum 2 years of job history
             */

public class PracticeNestedIf {

    public static void main(String[] args) {

        double salary=20000;
        int jobhistory=3;

        if (salary>=30000){
            if(jobhistory>=2){
                System.out.println("You are qualified");
            }else {
                System.out.println("You must have been on job at least 2 years");
            }
        }else{
            System.out.println("You MUST earn at least $30K");
        }

    }
}
