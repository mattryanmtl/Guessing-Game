import java.util.*;

public class Main {

    public static void main(String[] args) {

        short userChoice;                           //option chosen by the user
        Game game = new Game();                     //new Game
        String input;                               //declare variable to handle input
        Scanner inOption = new Scanner(System.in);  //new Object to read input

        do {
            //Display menu and wait for user's choice
            userChoice = game.DisplayMenu();
            //if user's choice different from 0, start game
            if (userChoice != 0) {
                
                game.PlayGame(userChoice);  //call Play Game method

                System.out.println("|     You guessed " + game.padLeft(Integer.toString(game.totalGuesses),4) + " time(s) to find it out!      |");
                System.out.println("---------------------------------------------------  ");
                System.out.println("|             Do you wanna play again??             |");
                System.out.println("---------------------------------------------------- ");
                System.out.println("|       Press N to exit or ENTER to Play Again      |");
                System.out.println("---------------------------------------------------- ");
                System.out.print("> ");

                //Read user's input
                input = inOption.nextLine();

                //if input is N, Game Over.
                if (input.equals("n") || input.equals("N")) {
                    userChoice = 0;
                }
            }

        } while (userChoice != 0); //loop until user wants to exit

        
        System.out.println("---------------------------");
        System.out.println("|  Thank you for playing! |");
        System.out.println("|         See ya!!        |");
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();

    }
}
