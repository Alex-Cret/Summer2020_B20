package day25_Practices;

public class LongestString {


        public static void main(String[] args) {

            String[] arr = {"Anam", "Nickolas", "Amir", "Nurmemet"};
            int MaxLength = arr[0].length();

            for (int i = 0; i < arr.length; i++) {

                int l = arr[i].length();
                if (l > MaxLength) {
                    MaxLength = l;
                }
            }

            System.out.println(MaxLength);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() == MaxLength) {

                    System.out.println("Longest word:" + arr[i]);
                }
            }

        }}

