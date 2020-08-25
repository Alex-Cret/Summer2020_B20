package day11_NestedIf_Turnary;

public class Ternary {

    public static void main(String[] args) {

        int num=100;

        String result="";

        if(num%2==0){
            result="Even";
        } else{
            result="Odd";
        }
        System.out.println(result);
        System.out.println("=================Ternary=====================");

     String result2 =   (num%2==0)? "Even" : "Odd";

        System.out.println(result2);
        System.out.println("==================================================");

        int num1=10;
        int num2=20;
        int max1=0;

        if (num1>num2){
            max1=num1;
        }else{
            max1=num2;
        }
        System.out.println(max1);
        System.out.println("=============Ternary================");

        int max2= (num1>num2)? num1 : num2;

        System.out.println(max2);
        System.out.println("=========================================");

        int age=20;
       String citizenship="USA";

        String result3= (age>=18 && citizenship=="USA")? "Can vote" : "Can't vote";
        System.out.println(result3);
        System.out.println("==================================================");

        int age1=20;
        boolean elegible1=false;

        if (age1>=21){
            elegible1=true;
        }else {
            elegible1=false;
        }




    }

}
