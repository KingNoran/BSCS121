
package TriPrism;
import java.util.Scanner;


public class TriPrism<N, N2, N3> {
    private N length;
    private N2 base;
    private N3 height;
    
    public void setValue(N l, N2 b, N3 h){
        this.length = l;
        this.base = b;
        this.height = h;
    }

    public N getNvalue(){
        return length;
    }
    
    public N2 getN2value(){
        return base;
    }    
    
    public N3 getN3value(){
        return height;
    }
}

class TriPrismDemo{
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        //declare object 1
        
        TriPrism<Integer, Integer, Integer> tp1 = new TriPrism();
        
        //prompt the user for object 1 values
        
        System.out.print("Enter the first prism's length(integer): ");
        int il = sc.nextInt();
        System.out.print("Enter the first prism's length(integer): ");
        int ib = sc.nextInt();
        System.out.print("Enter the first prism's length(integer): ");
        int ih = sc.nextInt();
        
        //declare object 2
        
        TriPrism<Double, Double, Double> tp2 = new TriPrism();
        
        //prompt the user for object 2 values
        
        System.out.print("Enter the second prism's length(double): ");
        double dl = sc.nextDouble();
        System.out.print("Enter the second prism's length(double): ");
        double db = sc.nextDouble();
        System.out.print("Enter the second prism's length(double): ");
        double dh = sc.nextDouble();
        
        //set object 1 values
        
        tp1.setValue(il, ib, ih);
        
        //set object 2 values
        
        tp2.setValue(dl, db, dh);
        
        //get object 1 values
        
        int[] tp1values = {tp1.getNvalue(), tp1.getN2value(), tp1.getN2value()};
        
        //convert object 1 values to double
        
        double[] convert = {tp1values[0],tp1values[1], tp1values[2]};

        //get object 2 values
        
        double[] tp2values = {tp2.getNvalue(), tp2.getN2value(), tp2.getN3value()};
        
        //print object 1
        
        System.out.println("Triangular Prism 1" 
                + "\nLength: " +    tp1values[0] 
                + "\nBase: " +      tp1values[1] 
                + "\nHeight: " +    tp1values[2]);
        
        System.out.println("The volume of the first triangular prism is: " + volume(convert[0], convert[1], convert[2]));
        
        //print object 2
        
        System.out.println("\nTriangular Prism 2" 
                + "\nLength: " +    tp2values[0] 
                + "\nBase: " +      tp2values[1] 
                + "\nHeight: " +    tp2values[2]);
        
        System.out.println("The volume of the second triangular prism is: " 
                + volume(tp2values[0], tp2values[1], tp2values[2]));
    }
    
    //volume method
    private static double volume(double length, double base, double height){
        double volume = length * (0.5 * base * height);
        return volume;
    }    
}