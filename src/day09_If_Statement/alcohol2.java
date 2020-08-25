package day09_If_Statement;

public class alcohol2 {


    public static void main(String[] args) {
        int age=12;
        boolean hasID=true;

        boolean eligible=age>=21 && hasID==true;

        if(eligible){
            System.out.println("can buy alcohol");
        } else {
            System.out.println("can not buy alcohol");
        }

    }
}
