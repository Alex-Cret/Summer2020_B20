package day26_MultiDimentionalArray;

import java.util.Arrays;
/*
 1. write a program that can sort the array in descending order
            ex:
                arr1: { 10, 11, 8, 9, 12, 5, 15};
                output:
                    arr2: {15, 12, 11, 10, 9, 8, 5}

 */
public class SortDescending {
    public static void main(String[] args) {

        int[] arr={2,1,3};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] desc=new int[arr.length];

        int k=arr.length-1;
        for (int i = 0; i <=desc.length-1 ; i++) {
            desc[i]=arr[k];
                    k--;

        }
        System.out.println(Arrays.toString(desc));


    }

}
