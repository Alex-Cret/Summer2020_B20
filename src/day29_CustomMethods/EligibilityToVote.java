package day29_CustomMethods;

class Eligibility {
    /*
    age, citizen,name
     */

    public static void main(String[] args) {
        vote("John",28,true,"Biden");
        vote("Daniel",17,true,"Kanye");

        calculator(10,'+',20);
    }


    public static void vote(String name, int age, boolean citizen, String candidateName){

        boolean elegibleToVote= age>=18 && citizen==true;
        if (elegibleToVote){
            System.out.println(name+" is eligible to vote fo Donald Trump");
        }else{
            System.out.println(name+" is not eligible to vote");
        }
    }

public static void  eligibleToBuyAlcohol(boolean hasID,int age){
        if (hasID && age>=21){
            System.out.println("You are eligible to by alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }
}

public static void calculator(double num1,char operator,double num2){
        // +,-,*,/,%
    switch (operator){
        case '+':
            System.out.println("Adition: "+(num1+num2));
            break;
        case '-':
            System.out.println("Substraction "+(num1-num2));
            break;
        case '*':
            System.out.println("Multiplication "+(num1*num2));
            break;
        case '/':
            System.out.println("Division "+(num1/num2));
            break;
        case '%':
            System.out.println("Remainder "+(num1-num2));
            break;
        default:
            System.out.println("Invalid Operator");
    }

}

}
