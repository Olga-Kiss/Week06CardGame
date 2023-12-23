package Week06CardsProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;


    public Deck () {
    	this.cards = new ArrayList<Card>();
    	initializeDeck();
    }	
       	
    private void initializeDeck() {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                String name = getValueName(value) + " of " + suit;
                Card card = new Card(value, name);
                cards.add(card);
            }
        }
    }

    private String getValueName(int value) {
        switch (value) {
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            case 14: return "Ace";
            default: return String.valueOf(value);
        }
    }

    // Shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    // Draw method
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;  // Deck is empty
    }
}