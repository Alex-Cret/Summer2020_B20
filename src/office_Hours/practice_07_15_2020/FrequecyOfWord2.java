package office_Hours.practice_07_15_2020;

public class FrequecyOfWord2 {

    public static void main(String[] args) {
        String str="JavajavajavaJavaJAVA";
        str=str.toLowerCase();
        int count=0;
        while(str.contains("java")){
            count++;
           str= str.replaceFirst("java","");

        }
        System.out.println(count);
    }
}
