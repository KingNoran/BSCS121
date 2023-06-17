import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInformationLogSheet {
    

    private static int findid;
    private static int inputid;
    
    private static String Fname;
    private static String Lname;
    private static String MiddleI; 
    private static String Course1;
    private static String resetstr;
    private static int year;
    private static int resetint;
    private static int Mgrades;
    private static int Egrades;
    private static int Hgrades;
    private static int Sgrades;
    private static int Fgrades;
    private static int p = Mgrades + Egrades + Hgrades + Sgrades + Fgrades;
    private static int Av = p/5;
    
    public static void main(String[] args) throws IOException{
        StudentInformationLogSheet.creupchoice();
    }
 
    static void creupchoice(){
        Scanner scstr = new Scanner(System.in);
        String CUchoice;
        try{
        System.out.print("Welcome. Please type CREATE to create a new file, UPDATE to update a file, or END to terminate the program: ");
        CUchoice = scstr.nextLine().toUpperCase();
        if(CUchoice.equals("CREATE")){
        System.out.println("The user has chosen to CREATE a NEW FILE!");
        System.out.println("--------------------------");
        StudentInformationLogSheet.enterid();
        }
        else if(CUchoice.equals("UPDATE")){
        
        }
        else if(CUchoice.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
        }
        else{
            System.out.println("Please only input either CREATE or UPDATE. Please try again or type END to terminate the program.");
            StudentInformationLogSheet.creupchoice();
        }
        }
        catch(InputMismatchException e){
        System.out.println("Please only input either CREATE or UPDATE. Try again or type END to terminate the program.");
        StudentInformationLogSheet.creupchoice();
        }
    }
    
    static void enterid(){
        Scanner scint = new Scanner(System.in);
        try{
        System.out.print("Please enter a valid ID (It must only contain numbers): ");
        int id;
        id = scint.nextInt();
        inputid = id;
        StudentInformationLogSheet.Fstudentname();
        }
        catch(Exception e){
        System.out.println("Error. Please try again.");
        StudentInformationLogSheet.enterid();
        }
    }
   
    static void Fstudentname(){
        Scanner scstr = new Scanner(System.in);
        String f;
        try{
        System.out.print("Please enter the FIRST NAME: ");
        f = scstr.nextLine();
        if(f.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
        }
        else{
        Fname = f;
        StudentInformationLogSheet.Mstudentname();
        }
        }
        catch(Exception e){
        System.out.println("Unknown Error. Please try again or type END to terminate the program.");
        StudentInformationLogSheet.Fstudentname();
        }
    }
    
    static void Mstudentname(){
        Scanner scstr = new Scanner(System.in);
        String m;
        try{
        System.out.print("Please enter the MIDDLE INITIAL: ");
        m = scstr.nextLine();
        if(m.length() != 1){
        System.out.println("Please enter only ONE CHARACTER for your middle INITIAL. Try again.");
        StudentInformationLogSheet.Fstudentname();
        }
        else if (m.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
        }
        else{
        MiddleI = m;
        StudentInformationLogSheet.Lstudentname();
        }
        }
        catch(Exception e){
        System.out.println("Unknown Error. Please try again or type END to terminate the program.");
        StudentInformationLogSheet.Fstudentname();
        }
    }
    
    static void Lstudentname(){
        Scanner scstr = new Scanner(System.in);
        String l;
        try{
        System.out.print("Please enter the LAST NAME: ");
        l = scstr.nextLine();
        if(l.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
        }
        else{
        System.out.println("--------------------------");
        Lname = l;
        StudentInformationLogSheet.studentcourse();
        }
        }
        catch(Exception e){
        e.getStackTrace();
        System.out.println("Unknown Error. Please try again or type END to terminate the program.");
        StudentInformationLogSheet.Fstudentname();
        }
    }
   
    static void studentcourse(){
        Scanner scstr = new Scanner(System.in);
        String c;
       try{
        System.out.println("A)BSIT   B)BSCS   C)BMMA   D)BACOMM\n\n");
        System.out.print("SELECT A COURSE by typing the LETTER of the corresponding course: ");
        c = scstr.nextLine();
        if (c.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
        }
        else if(c.length() != 1){
        System.out.println("Please enter only ONE CHARACTER of a corresponding course. Try again.");
        StudentInformationLogSheet.studentcourse();
        }
        else{
        switch(c){    
        case "A":
            Course1 = "BSIT";
            StudentInformationLogSheet.studentyear();
        
        case "B":
            Course1 = "BSCS";
            StudentInformationLogSheet.studentyear();
        
        case "C":
            Course1 = "BSMMA";
            StudentInformationLogSheet.studentyear();
        
        case "D":
            Course1 = "BACOMM";
            StudentInformationLogSheet.studentyear();
            
        case "E":
            Course1 = "BS Crim";
            StudentInformationLogSheet.studentyear();
        default:
        System.out.println("Invalid input. Try Again.");
        StudentInformationLogSheet.studentcourse();
        }
        }
    }
       catch(Exception e){
            e.getStackTrace();
            System.out.println("Unknown Error. Please try again or type END to terminate the program.");
            StudentInformationLogSheet.Fstudentname();
       }
    }
    
    

    static void studentyear()throws IOException{
        Scanner scint = new Scanner(System.in);
        int y;
        try{
        System.out.print("Please enter your YEAR. It can only be 1 to 4: ");
        y = scint.nextInt();
        if(y > 4||y < 1){
        System.out.println("Please type numbers only from 1 to 4. Try Again.");
        StudentInformationLogSheet.studentyear();
            }
        System.out.println("--------------------------");
        year = y;
        StudentInformationLogSheet.studentgrade();
        }
        catch(InputMismatchException e){
            e.getStackTrace();
            System.out.println("Please enter a NUMBER from 1 to 4. Try again.");
            StudentInformationLogSheet.studentyear();
        }
    }
   
    static void studentgrade() throws IOException{
        Scanner scint = new Scanner(System.in);
        int m, e, h, s, f;
        try{
        System.out.println("Please INPUT your GRADES in the following subjects. It cannot exceed 100 and cannot be lower than 1.");
        System.out.println("--------------------------");
        System.out.print("MATH: ");
        m = scint.nextInt();
        if(m > 100||m < 1){
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{System.out.print("ENGLISH: ");
        Mgrades = m;
        e = scint.nextInt();
        if(e > 100||e < 1){
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Egrades = e;
        System.out.print("HEKASI: ");
        h = scint.nextInt();
        if(h > 100||h < 1){
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Hgrades = h;
        System.out.print("SCIENCE: ");
        s = scint.nextInt();
        if(s > 100||s < 1){
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Sgrades = s;
        System.out.print("FILIPINO: ");
        f = scint.nextInt();
        if(f > 100||f < 1){
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Fgrades = f;
        StudentInformationLogSheet.fileWrite();
        System.out.println("--------------------------");
        System.out.println("RECORD ADDED!");
        }}}}}
        }
        catch(InputMismatchException p){
            p.getStackTrace();
            System.out.println("Please enter a NUMBER from 1 to 100. Try again.");
            StudentInformationLogSheet.studentgrade();
        }
    }
    

        
    static void fileWrite()throws IOException{
        Scanner rose = new Scanner (System.in);

        BufferedWriter fW = new BufferedWriter (new FileWriter("C:\\Users\\Admin\\Desktop\\StudentInformationLogSheet" + inputid + ".txt"));
        fW.write("--------------------------");
        fW.newLine();
        fW.write("STUDENT ID: " + inputid);
        fW.newLine();
        fW.write("STUDENT NAME: " + Fname + " " + MiddleI + ". " + Lname);
        fW.newLine();
        fW.write("COURSE AND YEAR: " + Course1 + year);
        fW.newLine();
        fW.write("--------------------------");
        fW.newLine();
        fW.write("GRADES");
        fW.newLine();
        if (Mgrades < 75){
        fW.write("MATH: " + Mgrades + " FAILED");
        }
        else{
        fW.write("MATH: " + Mgrades + " PASSED");
        }
        fW.newLine();
        if (Hgrades < 75){
        fW.write("HEKASI: " + Hgrades + " FAILED");
        }
        else{
        fW.write("HEKASI: " + Hgrades + " PASSED");
        }
        fW.newLine();
        if (Sgrades < 75){
        fW.write("SCIENCE: " + Sgrades + " FAILED");
        }
        else{
        fW.write("SCIENCE: " + Sgrades + " PASSED");
        }
        fW.newLine();
        if (Fgrades < 75){
        fW.write("FILIPINO: " + Fgrades + " FAILED");
        }
        else{
        fW.write("FILIPINO: " + Fgrades + " PASSED");
        }
        fW.newLine();
        fW.write("GENERAL AVERAGE: " + Av);
        fW.newLine();
        if (Av < 75){
        fW.write("GENERAL REMARKS: FAILED");
        }
        else{
        fW.write("GENERAL REMARKS: PASSED");
        }
        fW.close();
}

}
