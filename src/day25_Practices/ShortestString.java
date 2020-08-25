package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {

        String[] arr={"Anam","Nickolas","Amir","Nurmemet"};
int minLength=arr[0].length();

        for (String each:arr) {

            int l=each.length();
            if(l<minLength){
                minLength=l;
            }
        }

        System.out.println(minLength);
        for (String each:arr){
            if (each.length()==minLength){
                System.out.println("Shorter word:"+each);
            }
        }

    }

}
