package Threads;
import java.util.Scanner;

public class Handson09_1 extends Thread{
    
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args){
        Handson09_1 a = new Handson09_1();
        Handson09_1 b = new Handson09_1();
        System.out.print("Name your first thread: ");
        String x = sc.nextLine();
        System.out.print("Name your second thread: ");
        String y = sc.nextLine();
        
        a.setName(x);
        b.setName(y);
        System.out.println(a.getName() + " is NEW." + "\n" + b.getName() + " is NEW");
        
        System.out.println("Starting the threads...");
        a.start();
        try{
            a.join(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        b.start();
        try{
            a.join();
            b.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
        
        
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is RUNNABLE and RUNNING!");
        try{
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " is sleeping...");
        }
        catch(InterruptedException e){
        e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is now awake.");
        System.out.println(Thread.currentThread().getName() + " is TERMINATED.");
    }
}
