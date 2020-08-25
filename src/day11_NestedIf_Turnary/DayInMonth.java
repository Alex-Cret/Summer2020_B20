package day11_NestedIf_Turnary;

public class DayInMonth {
    /*
    . write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

     */

    public static void main(String[] args) {
int month=5;
        boolean  day28 = month==2;
        boolean day30 = month==4 || month==6 || month==9 || month==11;
        boolean invalid = month<1 ||month>12;

        String result="";

        if(day28){
            result="28 days";
        } else if (day30){
            result="30 days";
        }else if(invalid){
            result="Invalid";
        } else {
            result="31 days";
        }
        System.out.println(result);

        System.out.println(
                "============================Ternary=============================");

        String result2=(day28)? "28 days":(day30)?"30 days":"31 days";
        System.out.println(result2);
    }

}
