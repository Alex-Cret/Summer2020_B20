package SelfPractice.forloop;
/*
write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
 */
public class task1_brake {
    public static void main(String[] args) {

        for (int i=0; i<=100;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }


    }


}
