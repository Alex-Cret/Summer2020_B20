package day15_String;

public class Substring_method {
    public static void main(String[] args) {
        String sentence="Java is fun";
        //               012345678910
        // substracting(beg index, end index)
        String word=sentence.substring(0,4);
        System.out.println(word);

        String word1=sentence.substring(8,10+1);
        System.out.println(word1);

        System.out.println("==============================");

        String sentence2="I like Movies and TV Series";
        //                0123456789...
String word3=sentence2.substring(7,13);
        System.out.println(word3);
        System.out.println("============================");

        String firstName="alex";
        String firstCharacter=firstName.substring(0,1);

        String rest=firstName.substring(1,firstName.length());

        firstName=firstCharacter.toUpperCase()+rest.toLowerCase();

        System.out.println(firstName);

        System.out.println("========================================");

        String lastname="school";
        String firstChar=lastname.substring(0,1);
String remaining=lastname.substring(1);
        System.out.println(firstChar);
        System.out.println(remaining);
lastname=
firstChar.toUpperCase()+remaining.toLowerCase();
        System.out.println(lastname);
        System.out.println("=====================================");
String s="I like Game of Thrones";
//        1234567
String series=s.substring(7);
        System.out.println(series);
String s2="I like Java Programming Lamguage";
String language=s2.substring(7);
        System.out.println(language);








}
}