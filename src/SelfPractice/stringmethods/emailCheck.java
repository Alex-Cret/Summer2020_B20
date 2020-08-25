package SelfPractice.stringmethods;

/*
write a program that can check if the given gmail address is valid gmail account or not
        NOTE: a valid gmail account ends with @gmail.com
 */

public class emailCheck {
    public static void main(String[] args) {

        String eMail="allexanderr@mail.com";

        if (eMail.contains("@gmail.com")){
            System.out.println("eMail is valid");
        }else{
            System.out.println("Not valid eMail");
        }

        System.out.println("========================================");



    }


}
