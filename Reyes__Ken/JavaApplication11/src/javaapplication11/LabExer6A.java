package javaapplication11;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class LabExer6A {
    
    static Scanner charsc = new Scanner(System.in);
    static char input;
    static String output;
    static String difchoice;
    static String word1;
    static String word2;
    static String word3;
    static String word4;
    static String word5;
    static String word6;
    static String word7;
    static String word8;
    static String word9;
    static String word10;
    static String path = "C:\\Users\\Admin\\Desktop\\words.txt";
    static String answer;
    static String hiddenanswer;
    
    static int randy;
    static int size;
    static int randy2;
    static int tries = 7;
    
    
    
    
    
    public static void main(String[] args) throws IOException{
        LabExer6A.start();
    }
    
    
    
    
    
    
    
    static void start() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("WELCOME TO HANGAROO!");
        System.out.println("--------------------");
        System.out.print("Type START to start, RULES to know the rules, or END to terminate the program: ");
        String choose = sc.nextLine().toUpperCase();
        switch(choose){
            case "START":
                LabExer6A.getwords();
                LabExer6A.wordrandomizer();
                LabExer6A.wordhider();
                break;
            case "RULES":
                System.out.println("--------------------------");
                System.out.println("The rule is simple: Guess the missing letters.");
                System.out.println("You have a total of 7 tries. 7 fails result in failure.");
                System.out.println("However, if you guess all the letters, you win!");
                LabExer6A.start();
                break;
            case "END":
                System.out.println("--------------------------");
                System.out.println("PROGRAM END.");
                System.exit(0);
                break;
            default:
        }
    }
    static void getwords() throws IOException{
        try(BufferedReader read = new BufferedReader(new FileReader(path))){
            word1 = read.readLine();
            word2 = read.readLine();
            word3 = read.readLine();
            word4 = read.readLine();
            word5 = read.readLine();
            word6 = read.readLine();
            word7 = read.readLine();
            word8 = read.readLine();
            word9 = read.readLine();
            word10 = read.readLine();
        }
    }
    
    static void antizero(){
        Random rd = new Random();
        randy = rd.nextInt(10);
    }  
    
    static void wordrandomizer(){
    LabExer6A.antizero();
            if(randy == 0){
                LabExer6A.antizero();
            }
            else{  
                switch(randy){
                    case 1:
                        answer = word1;
                        break;
                    case 2:
                        answer = word2;
                        break;
                    case 3:
                        answer = word3;
                        break;
                    case 4:
                        answer = word4;
                        break;
                    case 5:
                        answer = word5;
                        break;
                    case 6:
                        answer = word6;
                        break;
                    case 7:
                        answer = word7;
                        break;
                    case 8:
                        answer = word8;
                        break;
                    case 9:
                        answer = word9;
                        break;
                    case 10:
                        answer = word10;
                        break;
                    default:
                        
                }
            }
    }
    
        
    
    
    static void wordhider(){
        size = answer.length();
        int index = size;
        char[] wordletters = new char[size];
        for(int i = 0; i < index; i++){
            wordletters[i] = answer.charAt(i);
        }
        System.out.print("\n");
        for(int i = 0; i < size - 1; i++){
        LabExer6A.letterrandomizer();
        wordletters[randy2] = '_';
        }
        hiddenanswer = String.valueOf(wordletters);
        LabExer6A.play();
    }  
    
    static void letterrandomizer(){
        Random rd = new Random();
        randy2 = rd.nextInt(size - 1);
    }
    
    
    static void play(){
        for(int i = 0; i < size; i++){
            System.out.print(hiddenanswer.charAt(i) + "   ");
        }
        System.out.print("Guess the word. You have " + tries + " tries: ");
        input = charsc.nextLine().charAt(0);
        Pattern pattern = Pattern.compile(String.valueOf(input), Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(answer);
        Pattern pattern2 = Pattern.compile(hiddenanswer);
        Matcher matcher2 = pattern.matcher(answer);
        int x = matcher2.start();
        boolean y = matcher2.find();
        if(y){
            System.out.println(x);
            System.out.println(y);
        }
        else if(!y){
            tries--;
        }
        System.out.println(x);
        System.out.println("\n");
        
    }
}
