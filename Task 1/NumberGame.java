import java.util.Random;
import java.util.Scanner;

class Function{
    int rounds = 0;
    int score = 0;
    public void game(){
        Scanner sc = new Scanner(System.in);
        rounds++;
        Random RandomNum = new Random();
        int number = 1 + RandomNum.nextInt(100); // random class gives a random no. till bound value that is 100 iclusive 0 so i added 1 Now, if the random no. is 0 it will become 1
        int trials = 5;
        int i, Guess;
        System.out.println("A Number is chosen Between 1 to 100");
        System.out.println("There are five lives.");

        for(i = 1; i <=  trials; i++){
            System.out.println("Guess the number");
            Guess = sc.nextInt();

            if(Guess == number){
                System.out.println("Congratulations!");
                System.out.println("You Guessed correctly.");
                score++;
                break;
            }

            else if(Guess < number){
                System.out.println("The number is greater than "+Guess);
                System.out.println("-1 life");
            }

            else if(Guess > number){
                System.out.println("The number is less than "+Guess);
                System.out.println("-1 life");
            }

        }

        System.out.println();
        System.out.println("The number was "+number);
        System.out.println("Game over");
        System.out.println("Rounds played: "+rounds);
        System.out.println("Your score: "+score);
        System.out.println("do you want to play again (true/false) ?");
        Boolean replay = sc.nextBoolean();
        while(replay == true){
            game();
            return;
        }
    }

}
public class NumberGame{
    
    public static void main(String args[]){
        Function game = new Function();
        game.game();
    }
}