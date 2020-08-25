package office_Hours.practice_07_28_2020;

import java.util.ArrayList;

public class Method_Practice {

    public static void main(String[] args) {
        String name = "level";
        String reversedName = reverseStr(name);

        System.out.println(reverseStr(name));
        System.out.println(reversedName);
        isPalindrome("level");
        System.out.println("==========================================");

        String[] names = {"Aslan","Ramazan","Alex","Erfan","Aalia","Ayhan"};
        ArrayList<String> nameList=new ArrayList<>();
        for (String each:names) {
            System.out.println(reverseStr(each));
            isPalindrome(each);

            nameList.add(reverseStr(each));

        }
        System.out.println(nameList);

        }


    public  static String reverseStr(String str){
        String result="";
        for (int i=str.length()-1; i>=0; i--){
          result+= str.charAt(i);
        }

        return result;
    }

    public static void isPalindrome(String str){
        String reversedStr=reverseStr(str);
        boolean palindrome=str.equalsIgnoreCase(reversedStr);

        System.out.println(palindrome ? "Is Polindrome":"Is not Polindrome");
    }

}
