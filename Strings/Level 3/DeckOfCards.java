import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();
        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        if (n % x != 0) {
            System.out.println("Cannot distribute evenly.");
            return;
        }

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;

        String[] deck = initializeDeck(suits, ranks, numOfCards);
        shuffleDeck(deck, numOfCards);
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players, x, n / x);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks, int numOfCards) {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck, int n) {
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int n, int x) {
        String[][] players = new String[x][n / x];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n / x; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players, int x, int cardsPerPlayer) {
        for (int i = 0; i < x; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
