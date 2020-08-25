package office_Hours.practice_07_14_2020;

public class Uniq {
    public static void main(String[] args) {

        String str="ABABCE";

        String expectedResult="";  // C
        for(int j=0;j<str.length();j++){
        char ch=str.charAt(j); //A
        int count=0;



        for (int i=0;i<str.length(); i++) {
            char each = str.charAt(i);
            if (ch == each) {
                count += 1;

            }
        }


        if(count==1){
            expectedResult+=ch;
        }

}
        System.out.println(expectedResult);

    }

}
