import java.util.Scanner;
import java.util.Random;
    class Game{
        int compnum;
        int usernum;
        static int numOfGuess;

    Game(){
        Random compgen=new Random();
        compnum=compgen.nextInt(100);
        numOfGuess=0;
    }
    void Userinput(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number: ");
        usernum=scan.nextInt();
    }
    void isCorrect(){
        while(usernum!=compnum){
            
            this.Userinput();
            Game.numOfGuess++;
            if(usernum>compnum){
                System.out.println("Your number is greater");

            }
            else if (usernum<compnum){
                System.out.println("Your number is lesser");
            }
        }
        System.out.println("Your number matches computer number");
    }
    }

    class a14_constructorques{
    public static void main(String[] args){
        Game one=new Game();

        one.isCorrect();
        System.out.println("Total number of Guesses is: "+ Game.numOfGuess);

    }
}