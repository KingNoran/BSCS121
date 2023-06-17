package Handson_Activity07_ARGS;


public class Car extends Color{
    static int year;
    static Models model;
    static Colors color;
    
    Car(int yr, Models m, Colors c){
        Car.year = yr;
        Car.model = m;
        Car.color = c;
    }
    
    
    public static void display(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Car Model:  " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Year Made: " + year);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
