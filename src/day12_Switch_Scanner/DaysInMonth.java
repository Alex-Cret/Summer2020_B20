package day12_Switch_Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int month=3;
        String r="";

        switch(month){
            case 2:
                r="28 Days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                r="30 Days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                r="31 Days";
                break;

            default:
                r="Invalid Number";

                        }
        System.out.println(r);

    }

}
