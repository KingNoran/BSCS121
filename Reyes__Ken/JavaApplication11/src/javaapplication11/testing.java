package javaapplication11;
import java.util.regex.*;
import java.util.*;

public class testing {
    
    static String word = "Fairytale";
    static int size;
    static int randy;
    
    public static void main(String args[]) 
    {  
        testing.method();
    }
    
    static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a letter: ");
        char letter = sc.nextLine().charAt(0);
       
        Pattern pattern = Pattern.compile(String.valueOf(letter));
        Matcher matcher = pattern.matcher(word);
        boolean s = matcher.find();
        String q = word.replace(letter, '_');
        System.out.print(s);
        System.out.print(q);
    }
}
