package office_Hours.practice_08_19_2020;

import java.util.ArrayList;

public class PizzaObject {

    public static void main(String[] args) {

        ArrayList<Pizza> PizzaForBatch20=new ArrayList<>();

        for (int i=0;i<400;i++) {


            Pizza myPizza = new Pizza();
            myPizza.setPizzaInfo("Large", 2, 0);

            PizzaForBatch20.add(myPizza);

        }
        System.out.println("Total Number of Pizza: "+PizzaForBatch20.size());
        double totalPrice=0;

        for (Pizza each:PizzaForBatch20) {
           totalPrice +=each.calcPrice();

        }
        System.out.println("Total Price: "+totalPrice);

        System.out.println("=======================================================");

        Pizza pizza1=new Pizza();
        pizza1.setPizzaInfo("Large",3,4);

        Pizza pizza2=new Pizza();
        pizza2.setPizzaInfo("Medium",3,2);
        System.out.println("Nadir's Pizza: $"+pizza1.calcPrice());;
        System.out.println();
        System.out.println("Saim's Pizza: $"+pizza2.calcPrice());



    }



}
