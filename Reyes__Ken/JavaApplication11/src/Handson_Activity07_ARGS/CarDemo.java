package Handson_Activity07_ARGS;
import java.util.*;
import java.io.*;

public class CarDemo extends Car{
    
    static int randomyear;
    
    static Models finalmodel;
    static Colors finalcolor;
    
    static Models mget;
    static Colors cget;
    static int yget;
    
    public CarDemo(int yr, Models m, Colors c) {
        super(yr, m, c);
        
        
        yget = yr;
        mget = m;
        cget = c;
    }
    
    public static void main(String[] args){
        
        System.out.println("CAR 1 DETAILS");
        CarDemo car1 = new CarDemo(2014, mget.SUV, cget.RED);
        Car.display();
        System.out.println("CAR 2 DETAILS");
        CarDemo car2 = new CarDemo(2023, mget.SUV, cget.YELLOW);
        Car.display();
        
    }

    
}
