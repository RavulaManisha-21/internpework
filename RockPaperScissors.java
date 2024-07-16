import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        while(true){
            String[] rps={"r","p","s"};
            String computerMove=rps[new Random().nextInt(rps.length)];
            String playerMove;
            while(true){
                System.out.println("Please enter your move(r,p,s):");
                playerMove=sc.nextLine();
                if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
                    break;
                }
                System.out.println(playerMove+" is not a valid move.");
            }
            System.out.println("Computer played:"+computerMove);
            if(playerMove.equals(computerMove)){
                System.out.println("The game was a tie!");
            }
            else if(playerMove.equals("r")){
                if(computerMove.equals("p")){
                    System.out.println("You Lose!");
                }
                else if(computerMove.equals("s")){
                    System.out.println("You Win!");
                }
            }
            else if(playerMove.equals("p")){
                if(computerMove.equals("r")){
                    System.out.println("You Win!");
                }
                else if(computerMove.equals("s"))
                {
                    System.out.println("You Lose!");
                }
            }
            else if(playerMove.equals("s")){
                if(computerMove.equals("p")){
                    System.out.println("You Win!");
                }
                else if(computerMove.equals("r")){
                    System.out.println("You Lose!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain=sc.nextLine();
            if(!playAgain.equals("y")){
                break;
            }
        }
        sc.close();
    }
    
}
