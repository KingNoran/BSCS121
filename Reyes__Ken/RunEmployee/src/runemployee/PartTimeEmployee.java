///
package runemployee;
import java.util.Scanner;
public class PartTimeEmployee {
    public double ratePerhour;
    public int hoursWorked;
    public double wage;
    
    public void setWage(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your rate per hour and hours worked serparated by a space: ");
    ratePerhour = sc.nextDouble();
    hoursWorked = sc.nextInt();
    }
    
    public double getWage(Employee P){
    wage = ratePerhour * hoursWorked;
    P = new Employee(wage);
    return wage;
    }
}

