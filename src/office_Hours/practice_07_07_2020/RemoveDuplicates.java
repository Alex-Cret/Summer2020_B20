package office_Hours.practice_07_07_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str="aabbcc";
        String result="";

        for(int i=0;i<=str.length()-1;i++){

String s=""+str.charAt(i);

if(result.contains(s)){
    continue;
}else{
    result+=s;
}


        }
        System.out.println(result);
    }

}
