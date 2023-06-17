
package runemployee;
import java.util.Scanner;
public class RunEmployee {
    public static void main(String[] args) {
    RunEmployee r = new RunEmployee();
    r.setName();
    }
    
}

class Employee {
    
    public String name;
    
    public void setName(String newName){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the Employee: ");
    name = sc.nextLine();
    }
    
    public String getName(){
    return name;
            }
    
    Employee(){}
    
    Employee(double salaryorwage){
    double salary = salaryorwage;
    double wage = salaryorwage;
    }
    

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


    
}
