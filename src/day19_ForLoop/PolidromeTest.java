package day19_ForLoop;

public class PolidromeTest {

    public static void main(String[] args) {
        String str="mom";
        String reversedStr="";

        for(int i=str.length()-1;i>=0; i--){
            reversedStr+=str.charAt(i);



        }
        System.out.println(reversedStr);
        System.out.println(str.equals(reversedStr));
    }

}