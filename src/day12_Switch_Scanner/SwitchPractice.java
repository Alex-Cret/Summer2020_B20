package day12_Switch_Scanner;
/*
Write a program to display days:
1-Monday
2-Tuesday
3-Wednesday
4-Thursday
5-Friday
6-Saturday
 */

public class SwitchPractice {

    public static void main(String[] args) {

        int num=6;
        String result="";
        switch (num){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result="wednesday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
               break;
            default:
                result="Invalid";
                break;
        }
        System.out.println(result);

    }

}
