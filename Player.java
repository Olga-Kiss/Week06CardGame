package Week06CardsProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = name;
    }

    // Describe method
    public void describe() {
        System.out.println("Player: " + name);
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip method
    public Card flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        }
        return null;  // Player's hand is empty
    }

    // Draw method
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    // IncrementScore method
    public void incrementScore() {
        score++;
    }

    // Getters
    public int getScore() {
        return score;
    }
}
