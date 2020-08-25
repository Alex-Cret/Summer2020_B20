package day11_NestedIf_Turnary;

public class
    /*
     write a java program that can convert numbers
     between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

     */
ConvertNumbersToWords {

    public static void main(String[] args) {

        int num=2;

        String result="";

        if (num==0){
            result="Zero";
        }else if(num==1){
            result="One";
        }else if(num==2){
            result="Two";
        }else if(num==3){
            result="Three";
        }else if(num==4){
            result="Four";
        }else if(num==5){
            result="Five";
        }else if(num==6){
            result="Six";
        }else if(num==7) {
            result="Seven";
        }else if(num==8) {
            result="Eight";
        }else if(num==9) {
            result="Nine";
        }else {
            result="Invalid";
        }
        System.out.println(result);
        System.out.println("===================Ternary===============");

        String result2=(num==0)? "zero":(num==1)? "one":(num==2)? "two" :(num==3)? "three" :(num==4)? "four" : (num==5)?
                "five" :
        (num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":"Invalid";
        System.out.println(result2);

    }

}
