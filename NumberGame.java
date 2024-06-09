import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        int chances = 5;
        int finals = 0;
        boolean playAgain=true;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Hey you have about"+chances+"to win the game");
        System.out.println("Enter your guess");
        while (playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chances"+(i+1)+"Enter your guess:");
                int user = Sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won it.");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High.");
                }
                else{
                    System.out.println("Too Low.");
                }
            }
            if(guess==false){
                System.out.println("Sorry you lost the chances!The number is"+rand);
            }
            System.out.println("Do you want to play again(y/n)");
            String PA=Sc.next();
            playAgain=PA.equalsIgnoreCase("y");
            
        }
        System.out.println("That's it ,Hope you enjoyed it");
        System.out.println("Here is your score"+finals);
    }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
        }
    }   

