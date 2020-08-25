package day08_LogicalOperators;

public class Logical {
    public static void main(String[] args) {


    boolean r1=9>7; // true
    boolean r2=!r1; // false !r-opposite

        System.out.println(r1+" : "+r2);

        System.out.println(!true); //false
        System.out.println(!false); // true

        boolean r3= !false==true;
            //       true== true ==> true

        boolean r4=true==!true;
           // true==false==>false

        boolean r5=9>5 && 9>10;
        //      true && false ==>false

        boolean r8=true==!false || false==true;

        System.out.println(r8);

    }


}
