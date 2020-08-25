package day07_Unary_ShortHand;

public class ShortHand {

    public static void main(String[] args) {

        int a=100;

        a*=a; //a=a*a

        System.out.println(a);

        int c=300;
        c-=100; //200

        System.out.println(c);

        System.out.println("==========================================");

        // +=:

        int z=300;
        z +=200; //z=z+200

        System.out.println(z);

        String schoolName="Cybertek";
        //schoolName=schoolName + " School";
        schoolName += " School";

        System.out.println(schoolName);

        String fullName="Alex";

        fullName+=" Cretu";
        System.out.println(fullName);

        // /=;
         int budget=100000;
         budget/=2;

        System.out.println(budget);

        //  %=
        int num=100;
         num%=3;

        System.out.println(num);

        double num2=400.5;
          num2 %=2;
        System.out.println(num2);



    }
}
