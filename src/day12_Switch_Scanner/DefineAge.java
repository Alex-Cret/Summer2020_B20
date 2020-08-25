package day12_Switch_Scanner;

public class DefineAge {
    /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150

     */

    public static void main(String[] args) {

        int age=19;

        String result="";

        if(age<=150 && age>0 ) {
            if (age<21){
                result="Teenager";
            }else if (age<55){
                result="Adult";
            }else {
                result="Senior";
            }
        }else {
            result="Invalid Age";
        }
        System.out.println(result);
    }

}
