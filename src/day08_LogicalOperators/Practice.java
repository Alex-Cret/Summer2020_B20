package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {

        String firstName="Alexandr";
        String lastName="Cretu";
        int age=19;
        String citizanShip="Moldova";

        boolean elegibleToVote= age>=18 && citizanShip=="USA";
        //                       19>=18 && "USA"
        //                       true && True
String fulName=firstName+" "+lastName;
        System.out.println(fulName +" is elegible to vote: "+elegibleToVote);


    }
}
