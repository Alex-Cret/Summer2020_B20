package day31_Recap;
/*
1. create a method that can reverse a string
2. identify if a string is palindrome
 */
public class Method_Practice2 {
    public static void main(String[] args) {

        String name="racecar";
       String rev= reverse1(name);

        System.out.println(reverse1(name));
        System.out.println(name.equalsIgnoreCase(reverse1(name)));
    }

    public static String reverse1(String str){
        String expectedResult="";

        for (int i=str.length()-1;i>=0;i--){
            expectedResult+=str.charAt(i);
        }
        System.out.println(expectedResult);
        return expectedResult;
    }


}
