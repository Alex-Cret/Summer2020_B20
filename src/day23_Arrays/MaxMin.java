package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {


    int[] arr ={5,5,6,9,8,7};
    int max=arr[0]; //5
    int min=arr[0];

        for (int i = 1; i <arr.length-1 ; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

}
}