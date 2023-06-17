//Import the necessary packages.
package javaapplication11;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class StudentInformationLogSheet{
    
    //we declare these accessors so that we can store the values and place them in the filewriter.
    
    //"inputid" variable for the filename of the txt document
    private static int inputid;
    //"Fname" variable for first name, of course. 
    private static String Fname;
    //"Lname" variable for the last name.
    private static String Lname;
    //"MiddleI" variable for middle initial. Was gonna put character but this one is better ig.
    private static String MiddleI; 
    //"Course1" variable for the course. It is a string type for the same reasons as the "MiddleI" variable.
    private static String Course1;
    //"year" variable for the year. Should be int type so that InputMismatchException catches wrong inputs.
    private static int year;
    //The following variables are for the grades.
    private static int Mgrades;
    private static int Egrades;
    private static int Hgrades;
    private static int Sgrades;
    private static int Fgrades;

    //main method.
    public static void main(String[] args) throws IOException{
        StudentInformationLogSheet.creupchoice();
        
    }
    //Choice method where the user decides if he will CHECK a file or CREATE a file. Can also END the program.
    static void creupchoice(){
        Scanner scstr = new Scanner(System.in);
        String CUchoice;
        try{
        System.out.print("Welcome. Please type CREATE to create a new file, CHECK check is a file exists, or END to terminate the program: ");
        CUchoice = scstr.nextLine().toUpperCase(); //.toUpperCase() so that the input will always be CAPITAL.
            //If the user inputs CREATE then the ENTERID method prompts.
            switch (CUchoice) {
                case "CREATE":
                    System.out.println("The user has chosen to CREATE a NEW FILE!");
                    System.out.println("--------------------------");
                    StudentInformationLogSheet.enterid();
                    break;
                case "CHECK":
                    System.out.println("The user has chosen to CHECK a FILE!");
                    System.out.println("--------------------------");
                    StudentInformationLogSheet.Echeck();
                    break;
                case "END":
                    System.out.println("--------------------------");
                    System.out.println("PROGRAM END.");
                    System.exit(0);
                default:
                    System.out.println("Please only input either CREATE or CHECK. Please try again or type END to terminate the program.");
                    StudentInformationLogSheet.creupchoice();
                    break;
            }
        }
        //If the user inputs a non-string value, the program reprompts the method.
        catch(InputMismatchException e){
        System.out.println("Please only input either CREATE or UPDATE. Try again or type END to terminate the program.");
        StudentInformationLogSheet.creupchoice();
        }
    }
    
    //Echeck method makes the user check if a record already exists.
    static void Echeck(){
        Scanner scstr = new Scanner(System.in);
        String e;
        System.out.print("Enter an existing STUDENT ID: ");
        e = scstr.nextLine();
        File file = new File("C:\\Users\\Admin\\Desktop\\StudentInformationLogSheet\\" + e + ".txt");
         if (file.exists()) 
           {
               //If file exists, it notifies the user and reprompts CREUPCHOICE.
            System.out.println("The directory or file exists!\n");
            System.out.println("--------------------------");
            StudentInformationLogSheet.creupchoice();
           } 
         
         else
          {
              //If file does NOT exist, it notifies the user and repromts CREUPCHOICE.
            System.out.println("The directory or file does not exist.\n");
            StudentInformationLogSheet.creupchoice();
          }
       }
    
    //ENTERID method is used to take a value for the inputid, which is stored for later use.
    static void enterid(){
        Scanner scint = new Scanner(System.in);
        try{
        System.out.print("Please enter a valid ID (It must only contain numbers and the ID must not exist yet): ");
        int id;
        id = scint.nextInt();
        File file = new File("C:\\Users\\Admin\\Desktop\\StudentInformationLogSheet\\" + id + ".txt");
         if (file.exists()) 
           {
               //If file exists, the program reprompts.
            System.out.println("The directory or file exists! Please try again.");
            System.out.println("--------------------------");
            StudentInformationLogSheet.enterid();
           }
        else{
                //If file does not exist, the program proceeds to take the first name.
        inputid = id;
        StudentInformationLogSheet.Fstudentname();
        }
        }
                //If the program senses an error in anyway, it reprompts the method.
        catch(Exception e){
        System.out.println("Error. Please try again.");
        StudentInformationLogSheet.enterid();
        }
    }
        //FSTUDENNAME method takes the firstname and stores the value for later use.
    static void Fstudentname(){
        Scanner scstr = new Scanner(System.in);
        String f;
        try{
        System.out.print("Please enter the FIRST NAME: ");
        f = scstr.nextLine();
        //If the user types END then the program ends.
        if(f.equals("END")){
            System.out.println("--------------------------");
            System.out.println("PROGRAM END.");
            System.exit(0);
        }
        else{
        //If the user types anything other than END, then it records the input and proceeds to take the Middleinitial.
        Fname = f;
        StudentInformationLogSheet.Mstudentname();
        }
        }
        //If the program senses an error in anyway, it reprompts the method.
        catch(Exception e){
        System.out.println("Error. Please try again or type END to terminate the program.");
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
            System.exit(0);
        }
        else{
        MiddleI = m;
        StudentInformationLogSheet.Lstudentname();
        }
        }
        //If the program senses an error in anyway, it reprompts the method.
        catch(Exception e){
        System.out.println("Error. Please try again or type END to terminate the program.");
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
            System.exit(0);
        }
        else{
        System.out.println("--------------------------");
        Lname = l;
        StudentInformationLogSheet.studentcourse();
        }
        }
        catch(Exception e){
            //If the program senses an error in anyway, it reprompts the method.
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
            System.exit(0);
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
       //If the program senses an error in anyway, it reprompts the method.
       catch(IOException e){
            e.getStackTrace();
            System.out.println("Unknown Error. Please try again or type END to terminate the program.");
            StudentInformationLogSheet.Fstudentname();
       }
    }
    
    
        //STUDENTYEAR methods takes the year and stores it value for later use.
    static void studentyear()throws IOException{
        Scanner scint = new Scanner(System.in);
        int y;
        try{
        System.out.print("Please enter your YEAR. It can only be 1 to 4: ");
        y = scint.nextInt();
        if(y > 4||y < 1){
            //If the user inputs anything other than numbers 1 to 4, then method reprompts.
        System.out.println("Please type numbers only from 1 to 4. Try Again.");
        StudentInformationLogSheet.studentyear();
            }
        else{
            //After the user inputs a correct int value, the program stores the value and proceeds to the next method.
        System.out.println("--------------------------");
        year = y;
        StudentInformationLogSheet.studentgrade();
        }
        
        }
            //If the program senses an incorrect input, the program reprompts.
        catch(InputMismatchException e){
            e.getStackTrace();
            System.out.println("Please enter a NUMBER from 1 to 4. Try again.");
            StudentInformationLogSheet.studentyear();
        }
    }
            //STUDENTGRADE methods records the values for the student's grades in all 5 subjects.
    static void studentgrade() throws IOException{
        Scanner scint = new Scanner(System.in);
        int m, e, h, s, f;
        try{
        System.out.println("Please INPUT your GRADES in the following subjects. It cannot exceed 100 and cannot be lower than 1.");
        System.out.println("--------------------------");
        System.out.print("MATH: ");
        m = scint.nextInt();
        if(m > 100||m < 1){
            //If the user inputs a value that is less than one and more than one hundred, the method reprompts.
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{System.out.print("ENGLISH: ");
        Mgrades = m;
        e = scint.nextInt();
        if(e > 100||e < 1){
            //If the user inputs a value that is less than one and more than one hundred, the method reprompts.
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Egrades = e;
        System.out.print("HEKASI: ");
        h = scint.nextInt();
        if(h > 100||h < 1){
            //If the user inputs a value that is less than one and more than one hundred, the method reprompts.
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Hgrades = h;
        System.out.print("SCIENCE: ");
        s = scint.nextInt();
        if(s > 100||s < 1){
            //If the user inputs a value that is less than one and more than one hundred, the method reprompts.
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Sgrades = s;
        System.out.print("FILIPINO: ");
        f = scint.nextInt();
        if(f > 100||f < 1){
            //If the user inputs a value that is less than one and more than one hundred, the method reprompts.
            System.out.println("--------------------------");
        System.out.println("Please enter digits ONLY from 1 to 100. Try again.");
        StudentInformationLogSheet.studentgrade();
        }
        else{Fgrades = f;
        //This method is the last method. After taking all values, the program proceeds to write it in a txt file.
        StudentInformationLogSheet.fileWrite();
        }}}}}
        }
        catch(InputMismatchException p){
            //If the user inputs anything other than an int type value then the program reprompts.
            p.getStackTrace();
            System.out.println("Please enter a NUMBER from 1 to 100. Try again.");
            StudentInformationLogSheet.studentgrade();
        }
    }
    

        //FILEWRITE method writes all the previous inputs into a txt file and puts them in a designated directory.
    static void fileWrite()throws IOException{

        try (BufferedWriter fW = new BufferedWriter (new FileWriter("C:\\Users\\Admin\\Desktop\\StudentInformationLogSheet\\" + inputid + ".txt"))) {
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
                //The method also decides if the grades are FAILING or PASSING.
                fW.write("MATH: " + Mgrades + " FAILED");
            }
            else{
                fW.write("MATH: " + Mgrades + " PASSED");
            }
            fW.newLine();
            if (Egrades < 75){
                //The method also decides if the grades are FAILING or PASSING.
                fW.write("HEKASI: " + Egrades + " FAILED");
            }
            else{
                fW.write("HEKASI: " + Egrades + " PASSED");
            }
            fW.newLine();
            if (Hgrades < 75){
                //The method also decides if the grades are FAILING or PASSING.
                fW.write("HEKASI: " + Hgrades + " FAILED");
            }
            else{
                fW.write("HEKASI: " + Hgrades + " PASSED");
            }
            fW.newLine();
            if (Sgrades < 75){
                //The method also decides if the grades are FAILING or PASSING.
                fW.write("SCIENCE: " + Sgrades + " FAILED");
            }
            else{
                fW.write("SCIENCE: " + Sgrades + " PASSED");
            }
            fW.newLine();
            if (Fgrades < 75){
                //The method also decides if the grades are FAILING or PASSING.
                fW.write("FILIPINO: " + Fgrades + " FAILED");
            }
            else{
                fW.write("FILIPINO: " + Fgrades + " PASSED");
                fW.newLine();
                fW.write("--------------------------");
            }
            fW.newLine();
            //The method also takes their average and decides if it is FAILING or PASSING.
            int p = Mgrades + Egrades + Hgrades + Sgrades + Fgrades;
            int Av = p/5;
            fW.write("GENERAL AVERAGE: " + Av);
            fW.newLine();
            if (Av < 75){
                fW.write("GENERAL REMARKS: FAILED");
            }
            else{
                fW.write("GENERAL REMARKS: PASSED");
            }
        }
        //Once the program is done making the txt, it reprompts again it continues until the user decides to END it.
        System.out.println("--------------------------");
        System.out.println("RECORD ADDED!");
        StudentInformationLogSheet.creupchoice();
}
}

