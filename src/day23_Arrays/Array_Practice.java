package day23_Arrays;

public class Array_Practice {

    public static void main(String[] args) {

        String[] students={"Cyberteck","Muhtar","Nadir","Asiya"};
                  //           0           1       2        3
     String name1= students[1];

        System.out.println(name1);

        System.out.println("================================");
        int [] scores={85,70,95,90,100};
        //             0   1 2   3 4
        String [] names={"Mike","Adam","Tonny","John","Ammy"};
        //                0      1       2       3     4

       for (int i=0; i<=4;i++){
           System.out.println(names[i]+" : "+scores[i]);

       }
        System.out.println("==========================================");

       String[] classMates=new String[5]; // size 5,

        classMates[0]="Fatih";
        classMates[2]="Hazel";
        classMates[1]="Viorel";
        classMates[3]="Elkem";
        classMates[4]="Ahmed";

        for(int i=0; i<=classMates.length-1; i++){

        System.out.println(classMates[i]);
        }




    }

}
