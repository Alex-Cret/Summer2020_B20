package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch='A';

        while (ch<='E'){
            if(ch=='C'){
                ch++;
                continue; // skip everything eve the iterator
            }
            System.out.println(ch);
            ch++;
        }

        System.out.println("===============================");

        boolean a=true;
while (a){
    System.out.println("Test started");
    //break;
    System.exit(0);
}

        System.out.println("Completed");
    }

}
