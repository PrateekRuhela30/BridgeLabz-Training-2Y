import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numGames = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;
        String[][] gameResults = new String[numGames][3]; // user choice, comp choice, winner

        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter your choice (0: Rock, 1: Paper, 2: Scissors): ");
            int userChoice = sc.nextInt();
            int compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            gameResults[i][0] = getChoiceName(userChoice);
            gameResults[i][1] = getChoiceName(compChoice);
            gameResults[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }

        displayResults(gameResults);
        String[][] stats = getStats(playerWins, computerWins, numGames);
        displayStats(stats);
    }

    public static int getComputerChoice() {
        return (int)(Math.random() * 3);
    }

    public static String getWinner(int user, int comp) {
        if (user == comp) {
            return "Draw";
        }
        if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) {
            return "Player";
        }
        return "Computer";
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            case 2: return "Scissors";
            default: return "Invalid";
        }
    }

    public static String[][] getStats(int playerWins, int compWins, int total) {
        double playerPercent = (double)playerWins / total * 100;
        double compPercent = (double)compWins / total * 100;
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";
        return stats;
    }

    public static void displayResults(String[][] results) {
        System.out.println("Game Results:");
        System.out.println("User Choice\tComputer Choice\tWinner");
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2]);
        }
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Statistics:");
        System.out.println("Player/Computer\tWins\tPercentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2]);
        }
    }
}
