package SelfPractice.Methods;

import java.util.Scanner;

public class Replit {


    public static void main(String[] args) {


int[] nums={5, 5, 5, 4, 4, 8};

        for(int element : nums ){
            int count = 0 ;
            for(int b : nums){
                if(element == b){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element+" ");
            }
        }





    }
}