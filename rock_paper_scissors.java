import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int playAgain;

        do {
            int playerScore = 0;
            int computerScore = 0;

            System.out.println("Welcome to Rock, Paper and Scissor game");
            System.out.println("0 = Rock");
            System.out.println("1 = Paper");
            System.out.println("2 = Scissor");

            System.out.print("Choose Best of 1, 3, 5, or 7: ");
            int totalRounds = sc.nextInt();
            System.out.println("You chose Best of " + totalRounds);

            int target = (totalRounds / 2) + 1;

            while (playerScore < target && computerScore < target) {
                System.out.print("Enter your choice: ");
                int yc = sc.nextInt();
                int comp = rn.nextInt(3);

                System.out.println("Your choice is " + yc);
                System.out.println("Computer's choice is " + comp);

                if (yc == 0 && comp == 0) {
                    System.out.println("It's a Draw!! Round replays");
                } else if (yc == 0 && comp == 1) {
                    System.out.println("You Lose!! Paper covers Rock");
                    computerScore++;
                } else if (yc == 0 && comp == 2) {
                    System.out.println("You Win!! Rock crushes Scissor");
                    playerScore++;
                } else if (yc == 1 && comp == 0) {
                    System.out.println("You Win!! Paper covers Rock");
                    playerScore++;
                } else if (yc == 1 && comp == 1) {
                    System.out.println("It's a Draw!! Round replays");
                } else if (yc == 1 && comp == 2) {
                    System.out.println("You Lose!! Scissor cuts Paper");
                    computerScore++;
                } else if (yc == 2 && comp == 0) {
                    System.out.println("You Lose!! Rock crushes Scissor");
                    computerScore++;
                } else if (yc == 2 && comp == 1) {
                    System.out.println("You Win!! Scissor cuts Paper");
                    playerScore++;
                } else if (yc == 2 && comp == 2) {
                    System.out.println("It's a Draw!! Round replays");
                } else {
                    System.out.println("You Entered something wrong!! please retry!!");
                }

                System.out.println("Score -> You: " + playerScore + " | Computer: " + computerScore);
            }

            System.out.println("\n=== Match Over ===");
            if (playerScore > computerScore) {
                System.out.println("You won the match " + playerScore + "-" + computerScore + "!");
            } else {
                System.out.println("Computer won the match " + computerScore + "-" + playerScore + "!");
            }

            System.out.print("\nWant to play again? 0 for yes, 1 for no: ");
            playAgain = sc.nextInt();

        } while (playAgain == 0);

        System.out.println("\nThank you for your cooperation!");
    }
}
