package SelfPractice.stringmethods;

public class loop {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};


        for(int element : arr ){
            int count = 0 ;
            for(int b : arr){
                if(element == b){
                    count++;
                }
            }

            if(count == 1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }


}

