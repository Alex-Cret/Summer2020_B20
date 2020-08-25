package day09_If_Statement;

public class alcohol {
    // write a java program that can idemtify if a person is elegible to buy alcohol


    public static void main(String[] args) {

        boolean hasID = true;
        int age = 23;

        boolean eligible = hasID && age >= 21;

        String result="";

        if (eligible == true) {
           // System.out.println("Eligible to buy alcohol");
          result="Eligible to buy alcohol";
        }
        if (eligible==false){
           // System.out.println("Not eligible to buy alcohol");
             result="You are not eligible to by alcohol";
        }
        System.out.println(result);
    }
}
