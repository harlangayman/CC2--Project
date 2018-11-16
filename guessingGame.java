package HARLAN_and_AIDS;
import java.util.Scanner;
public class guessingGame {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user,rndNum;
        rndNum = 503;
        System.out.println("GUESS THE NUMBER 1 - 1000: ");
        user = sc.nextInt();
        
        while (user != rndNum){
            
            if (user > rndNum){
                System.out.println("THE ANSWER IS LOWER!.");
            }
            if (user < rndNum){
                System.out.println("THE ANSWER IS HIGHER!.");
                
            if (user > 1000 || user < 1)
                System.out.println("INVALID ANSWER");
                
            }   
            if (rndNum % 2 == 1){
                System.out.println("THE ANSWER IS ODD!.");
            }
            if (rndNum % 2 == 0){
                System.out.println("THE ANSWER IS EVEN!."); 
            }
            
        System.out.println("GUESS THE NUMBER 1 - 1000: ");
        user = sc.nextInt();
        
        
            
        }
        System.out.println("CORRECT ANSWER!");
        System.out.println("YOUR ANSWER IS : " + user);
        System.out.println("THE RANDOM NUMBER IS : " + rndNum);
    
      }
}
