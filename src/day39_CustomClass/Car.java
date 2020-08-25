package day39_CustomClass;

public class Car {
    /*
    Attribute:
        model, brand, year, color, mileage, VIN....
     */
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

    public  void setInfo(String carBrand, String carModel, int carYear,
                         String carColor, double carMilage, double carPrice){

        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        mileage=carMilage;
        price=carPrice;

    }
    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+", "+color+", "
                +mileage+", $"+price);
    }
public void start(){
    System.out.println(brand+" "+model+" is started.");
}

}
