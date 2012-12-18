/* make a deck of cards

5 total decks
2 jokers per deck

deck actions:
drawing from deck

*/


import java.util.*;

public class Deck {
    
    List<Card> Deck = new ArrayList<Card>();

    public Deck() {	
    }
  
    public Deck oneDeck() {
	Deck oneDeck = new Deck();

	oneDeck.add(Card.JOKER); oneDeck.add(Card.JOKER); 
	for (int i = 0; i < 4; i++) {
	    oneDeck.add(Card.TWO);
	    oneDeck.add(Card.THREE);
	    oneDeck.add(Card.FOUR);
	    oneDeck.add(Card.FIVE);
	    oneDeck.add(Card.SIX); 
	    oneDeck.add(Card.SEVEN);
	    oneDeck.add(Card.EIGHT);
	    oneDeck.add(Card.NINE);
	    oneDeck.add(Card.TEN); 
	    oneDeck.add(Card.JACK);
	    oneDeck.add(Card.QUEEN);
	    oneDeck.add(Card.KING); 
	    oneDeck.add(Card.ACE);
	}
	return oneDeck;
    }
    
    public void addCard(Card c) {
	this.Deck.add(c);
    }

    public Card drawCard() {
	return this.Deck.remove(0);
    }

    public Deck fullDeck() {
	Deck d = new Deck();
	
	for (int i = 0; i < 5; i++) {
	    d.Deck.addAll(oneDeck().Deck);
	}

	return d;
    }
    
    public void shuffle() {
	for (int i = 0; i < 50; i++) {
	    for (Card c : this.Deck) {
		int swap = (int)(Math.random()*SIZE);
		
		this.Deck.set(this.Deck.indexOf(c), this.Deck.get(swap));
		this.Deck.set(swap, c); 
	    }
	}
    }




}


