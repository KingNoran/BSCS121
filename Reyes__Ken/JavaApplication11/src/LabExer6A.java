import java.io.*;
import java.util.*;



public class LabExer6A {

    static List<String> words = new ArrayList<>();

    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner getter = new Scanner(new File("C:\\Users\\Admin\\Desktop\\words.txt"));  
        Scanner sc = new Scanner(System.in);
        while(getter.hasNext()){
            words.add(getter.nextLine());
        }    

        Random randy = new Random();        
        String word = words.get(randy.nextInt(words.size()));
        System.out.println(word);
        List<Character> input = new ArrayList<>();
        
        
        int idiot = 0;
        while(true){
            ASCII(idiot);
            
            if(idiot >= 6){
                System.out.println("Sorry, but that man is dead. Better luck next time.");
                break;
            }
            
            checker(word, input);
            if(!guesser(sc, input, word)){
                idiot++;
            }
            
            
            
            if(checker(word, input)){
                System.out.println("Congratulations, YOU WIN!");
                break;
            }
            System.out.println("Enter your guess for the word: ");
            if(sc.nextLine().equals(word)){
                System.out.println("Congratulations, YOU WIN!");
                break;
            }
            else{
                System.out.println("Yikes. Try Again.");
            }
        }
        
        
        
    }
    
    private static void ASCII(int idiot){
    
            System.out.println(" -------");
            System.out.println(" I     I");
            
            if(idiot >= 1){
                System.out.println(" O");
            }
            
            if(idiot >= 2){
                System.out.print("\\ ");
                if(idiot >= 3){
                System.out.println("/");
                }
                else{
                System.out.print("\n");
                }
            }

            if(idiot >= 4){
                System.out.println(" I");
            }
            
            if(idiot >= 5){
                System.out.print("/ ");
                if(idiot >= 6){
                System.out.println("\\");
                }
                else{
                System.out.print("\n");
                }
            }
            
            
            
    
    }
    
    private static boolean checker(String word, List<Character> input){
        int congrats = 0;
        for(int i = 0; i < word.length(); i++){
            if(input.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                congrats++;
            }
            else{
                System.out.print("?");
            }
        }
        System.out.println("\n");
        return(word.length() == congrats);
    }

    private static boolean guesser(Scanner sc, List<Character> input, String word){
    System.out.print("Enter a letter: ");
        String letterinput = sc.nextLine();
        input.add(letterinput.charAt(0));
        return word.contains(letterinput);
        
    }
}
        
        
    


    

