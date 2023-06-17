import java.util.Scanner;

public class PartTimeEmployee {
    public double ratePerhour;
    public int hoursWorked;
    public double wage;
    
    public void setWage(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your rate per hour and hours worked serparated by a space(Example: 95.67 8): ");
    ratePerhour = sc.nextDouble();
    hoursWorked = sc.nextInt();
    }
    
    public double getWage(){
    wage = ratePerhour * hoursWorked;
    return wage;
    }
}
