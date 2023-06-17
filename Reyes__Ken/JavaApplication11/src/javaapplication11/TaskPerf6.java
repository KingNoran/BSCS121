package javaapplication11;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskPerf6 {
    static String path = ("C:\\Users\\Admin\\Desktop\\records.txt");
    static String username;
    static String password;
    static String user;
    static String pass;
    static Pattern pattern = Pattern.compile("\\W");
    
    public static void main(String[] args) throws IOException{
        TaskPerf6.choice();
    }
    
    static void choice() throws IOException{
        Scanner sc = new Scanner(System.in);
        String choose;
        try{
        System.out.print("--------Welcome!--------\n Please type REGISTER to register a new account\n LOGIN to an existing one\n CHECK to check if an account exists\n or END to terminate the program: ");
        choose = sc.nextLine().toUpperCase();
            switch (choose) {
                case "REGISTER":
                    System.out.println("--------------------------");
                    System.out.println("The user has chosen to REGISTER a NEW ACCOUNT!");
                    System.out.println("--------------------------");
                    TaskPerf6.register();
                    break;
                case "LOGIN":
                    System.out.println("--------------------------");
                    System.out.println("The user has chosen to LOGIN an EXISTING ACCOUNT!");
                    System.out.println("--------------------------");
                    TaskPerf6.login();
                    break;
                case "CHECK":
                    System.out.println("--------------------------");
                    System.out.println("The user has chosen to CHECK an ACCOUNT!");
                    System.out.println("--------------------------");
                    TaskPerf6.check();
                case "END":
                    System.out.println("--------------------------");
                    System.out.println("PROGRAM END.");
                    System.exit(0);
                default:
                    System.out.println("Please only input either LOGIN or REGISTER. Please try again or type END to terminate the program.");
                    TaskPerf6.choice();
            }
        }
        catch(InputMismatchException e){
            e.getStackTrace();
        }
        
    }
    
    static void login() throws IOException{
        Scanner log = new Scanner(System.in);
        System.out.print("Enter a valid username(Alphanumeric characters only): ");
        String user2 = log.nextLine();
        Matcher matcher = pattern.matcher(user2);
        boolean test = matcher.find();
        if(test){
            System.out.println("--------------------------");
            System.out.println("Please don't enter special characters and spaces. Try again.");
            System.out.println("--------------------------");
            TaskPerf6.login();
        }
        else{
            System.out.print("Enter a valid username(Alphanumeric characters only): ");
            String pass2 = log.nextLine();
            Matcher matcher2 = pattern.matcher(pass2);
            boolean test2 = matcher2.find();
            if(test2){
                System.out.println("--------------------------");
                System.out.println("Please don't enter special characters and spaces. Try again.");
                System.out.println("--------------------------");
                TaskPerf6.login();
            }
            else{
                user = user2;
                pass = pass2;
                TaskPerf6.logincheck();
            }
        }
        
        
        
        

    
    }
    
    static void logincheck() throws IOException{
    try(BufferedReader read = new BufferedReader(new FileReader(path))){
            String checker1 = read.readLine();
            String checker2 = read.readLine();
            if(checker1.contains(user) && checker2.contains(pass)){
                System.out.println("--------------------------");
                System.out.println("Successfully Logged In!");
                System.out.println("***");
            }
            else{
                System.out.println("--------------------------");
                System.out.print("The account does not exist. Please try again.");
                System.out.println("--------------------------");
                TaskPerf6.login();
            }
        }
    catch(Exception e){
        e.getStackTrace();
        }
    }
    
    static void register()throws IOException{
        Scanner rg = new Scanner(System.in);
        System.out.print("Enter a valid username(Alphanumeric characters only): ");
        String user1 = rg.nextLine();
        Matcher matcher = pattern.matcher(user1);
        boolean test = matcher.find();
        if(test){
            System.out.println("--------------------------");
            System.out.println("Please don't enter special characters. Try again.");
            System.out.println("--------------------------");
            TaskPerf6.register();
        }
        else{
            System.out.print("Enter a valid password(Alphanumeric characters only): ");
            String pass1 = rg.nextLine();
            Matcher matcher2 = pattern.matcher(pass1);
            boolean test2 = matcher2.find();
            if(test2){
                System.out.println("--------------------------");
                System.out.println("Please don't enter special characters and spaces. Try again.");
                System.out.println("--------------------------");
                TaskPerf6.register();
            }
            else{
                try(BufferedWriter write = new BufferedWriter(new FileWriter(path))){
                    write.append("Username: " + user1);
                    write.newLine();
                    write.append("Password: " + pass1);
                    write.close();
                }
                System.out.println("--------------------------");
                System.out.println("Account successfully created!");
                System.out.println("***");
                TaskPerf6.choice();
            }
        }
    }
        
    
    
    static void check() throws IOException{
    try(BufferedReader read = new BufferedReader(new FileReader(path))){
            String checker1 = read.readLine();
            String checker2 = read.readLine();
            System.out.print(checker1);
            System.out.print("\n" + checker2 + "\n");
            System.out.println("--------------------------");
            TaskPerf6.choice();
        }
    }
}
