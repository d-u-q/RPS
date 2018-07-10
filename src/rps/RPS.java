package rps;
import java.util.Scanner;
/**
 *
 * @author kianm
 */
public class RPS {

    public static void main(String[] args) {
        String cMove = "";
        String pMove = "";
        Boolean validMoveMade = false;
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Let's play rock paper scissors!");
        while(!validMoveMade){
            System.out.println("Make your move!");
            pMove = kb.nextLine();
        
            //input validation
            if(pMove.equalsIgnoreCase("rock") || pMove.equalsIgnoreCase("paper") || pMove.equalsIgnoreCase("scissors")){
                validMoveMade = true;                
            }
            else {
                System.out.println("ERROR: invalid move.");
            }             
        }
        cMove = generateMove();
            
        System.out.println(cMove + ", " + pMove);
        
        if (cMove == pMove){
            System.out.println("It's a draw!");
        }
        else{
            //TODO: MAKE IT WORK, DUCK
        }
    }
    
    private static String generateMove(){
        String move = "you shouldn't see this";
        
        //very advanced machine learning algorhythm ft. ai & blockchain technologies
        double rNum = Math.random();
        if (rNum < .33){
            move = "Rock";}
        else if (rNum < .66){
            move = "Paper";}
        else{
            move = "Scissors";}
        
        return move;
    }   
    
}
