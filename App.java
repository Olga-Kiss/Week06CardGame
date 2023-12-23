package Week06CardsProject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Instantiate a Deck and two Players
		        Deck deck = new Deck();
		        Player player1 = new Player("Player 1");
		        Player player2 = new Player("Player 2");

		        // Shuffle the deck
		        deck.shuffle();

		        // Draw cards and compare
		        for (int i = 0; i < 52; i++) {
		            player1.draw(deck);
		            player2.draw(deck);
		        }

		        // Play the game
		        for (int i = 0; i < 26; i++) {
		            Card card1 = player1.flip();
		            Card card2 = player2.flip();

		            System.out.println("Turn " + (i + 1) + ":");
		            System.out.println("Player 1 plays: " + card1.getName());
		            System.out.println("Player 2 plays: " + card2.getName());

		            // Compare the values of the cards
		            if (card1.getValue() > card2.getValue()) {
		                player1.incrementScore();
		                System.out.println("Player 1 wins this turn");
		            } else if (card1.getValue() < card2.getValue()) {
		                player2.incrementScore();
		                System.out.println("Player 2 wins this turn");
		            } else {
		                System.out.println("It's a tie, no points awarded");
		            }

		            System.out.println("Player 1 Score: " + player1.getScore());
		            System.out.println("Player 2 Score: " + player2.getScore());
		            System.out.println();
		        }

		        // Print the final score and determine the winner
		        System.out.println("Final Scores:");
		        System.out.println("Player 1: " + player1.getScore());
		        System.out.println("Player 2: " + player2.getScore());

		        if (player1.getScore() > player2.getScore()) {
		            System.out.println("Player 1 wins!");
		        } else if (player1.getScore() < player2.getScore()) {
		            System.out.println("Player 2 wins!");
		        } else {
		            System.out.println("It's a draw!");
		        }
		    }
		}
