import java.util.Scanner;


public class FullTimeEmployee {
    public double monthlySalary;
    public void setMonthlySalary(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your monthly salary: ");
    monthlySalary = sc.nextDouble();
    }
    
    public double getMonthlySalary(){
    return monthlySalary;
    }
}
