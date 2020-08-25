package office_Hours.practice_07_15_2020;

public class FrequencyOfWords {

    public static void main(String[] args) {
String str="cat cat cat dog dog Dog CAt".toLowerCase();

int countCat=0;
while(str.contains("cat")){
    countCat++;
    str=str.replaceFirst("cat","");

}
        System.out.println("Cat: "+countCat);

        int countDog=0;
        while(str.contains("dog")){
            countDog++;
            str=str.replaceFirst("dog","");

        }
        System.out.println("Dog: "+countDog);

        System.out.println();

    }

}
