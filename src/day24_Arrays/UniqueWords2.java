package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++", "Ruby"};

for(String each:words){
        String s = words[0];
        int count = 0;

        for (String b : words) { // b represent each elements in the array

            if (s.equals(b)) {
                count++;
            }

        }
        if (count == 1) {
            System.out.println(s);
        }

    }
    }
}
