package day11_NestedIf_Turnary;
/*
90-100==>A
80-89==>B
70-79==>C
60-69==>D
0-59==>E
other ==> invalid
 */

public class NestedIf {

    public static void main(String[] args) {

        int score=52;
        String result="";

        if(score>=0 && score<=100) { //valid score
            if (score >= 90) {
                result = "A";
            } else if (score >= 80 && score < 90) {
                result = "B";
            } else if (score >= 70 && score < 80) {
                result = "C";
            } else if (score >= 60 && score < 70) {
                result = "D";
            } else {    //invalid score
                result = "Invalid";
            }
            System.out.println(result);

            System.out.println("============================================");

            /*
            precondition:minimum salary of 30k
            sub condition: minimum 2 years of job history
             */




        }


    }


}

