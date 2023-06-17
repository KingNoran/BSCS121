import java.util.Scanner;
import java.text.DecimalFormat;

public class Employee {
    
    private static final DecimalFormat dc = new DecimalFormat("0.00");
    
    public String name;

    PartTimeEmployee p = new PartTimeEmployee();
    FullTimeEmployee f = new FullTimeEmployee();
    
    public void setName(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the Employee: ");
    name = sc.nextLine();
    System.out.print("Press P if part-time, or press F if full-time: ");
    char choose = sc.nextLine().charAt(0);
    if (choose == 'P' || choose == 'p'){
    p.setWage();
    System.out.println("Name: " + name);
    System.out.println("Job type: Part-Time Employee");
    System.out.println("Wage: " + dc.format(p.getWage()));
    }
    else if (choose == 'F' || choose == 'f'){
    f.setMonthlySalary();
    System.out.println("Name: " + name);
    System.out.println("Job Type: Full-Time Employee");
    System.out.println("Salary: " + dc.format(f.getMonthlySalary()));
    }
    else
    {
    System.out.print("Invalid input.");
    }
    }
    
    public String getName(){
    return name;
            }
}
