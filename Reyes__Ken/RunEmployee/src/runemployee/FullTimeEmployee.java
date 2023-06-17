
package runemployee;

import java.util.Scanner;


public class FullTimeEmployee {
    public double monthlySalary;
    public void setMonthlySalary(Employee F){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your monthly salary: ");
    monthlySalary = sc.nextDouble();
    F = new Employee(monthlySalary);
    }
    
    public double getMonthlySalary(){
    return monthlySalary;
    }
}

