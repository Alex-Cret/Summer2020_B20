package day28_Recap;

import java.util.Arrays;

public class Array_ShortQuizz {

    public static void main(String[] args) {
        char[] arr={'D','C','B','A'};

        Arrays.sort(arr);

        for (char each:arr){


            if(each=='D'){
                continue;

            }
            System.out.println(each);
        }
        System.out.println("========================================================");
String[] days={"sun","mon","wed","sat"};
int wd=0;
        for (int i = 0; i <days.length ; i++) {

            switch (days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                case"wed":
                    wd+=2;
            }

        }
        System.out.println(wd);

    }

}
