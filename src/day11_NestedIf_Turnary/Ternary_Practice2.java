package day11_NestedIf_Turnary;

public class Ternary_Practice2 {

    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
        System.out.println("================Ternary=================================");

        String result2= (num>0)? "Positive" :(num<0)? "Negative" :"Zero";
        System.out.println(result2);

        System.out.println("===================================================");

        /* write a programe that can compare 2 numbers
         a=10, b=20 output: b is greater

         */
        int a=20;
        int b=20;

        String r= (a>b)? "a is greate" : (a<b)? "b is greater" : "a is equal to b";
        System.out.println(r);

    }
    }


