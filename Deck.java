/* make a deck of cards

5 total decks
2 jokers per deck

deck actions:
drawing from deck

 */

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<Card>();

	public Deck() {
	}

	public Deck oneDeck() {
		Deck oneDeck = new Deck();

		oneDeck.addCard(Card.JOKER);
		oneDeck.addCard(Card.JOKER);
		for (int i = 0; i < 4; i++) {
			oneDeck.addCard(Card.TWO);
			oneDeck.addCard(Card.THREE);
			oneDeck.addCard(Card.FOUR);
			oneDeck.addCard(Card.FIVE);
			oneDeck.addCard(Card.SIX);
			oneDeck.addCard(Card.SEVEN);
			oneDeck.addCard(Card.EIGHT);
			oneDeck.addCard(Card.NINE);
			oneDeck.addCard(Card.TEN);
			oneDeck.addCard(Card.JACK);
			oneDeck.addCard(Card.QUEEN);
			oneDeck.addCard(Card.KING);
			oneDeck.addCard(Card.ACE);
		}
		return oneDeck;
	}

	public void addCard(Card c) {
		deck.add(c);
	}

	public Card drawCard() {
		return deck.remove(0);
	}

	public Deck fullDeck() {
		Deck d = new Deck();

		for (int i = 0; i < 5; i++) {
			d.deck.addAll(oneDeck().deck);
		}

		return d;
	}

	public void shuffle() {
		for (int i = 0; i < 50; i++) {
			for (Card c : deck) {
				int swap = (int) (Math.random() * deck.size());

				deck.set(deck.indexOf(c), deck.get(swap));
				deck.set(swap, c);
			}
		}
	}

	public boolean hasCard(Card c) {

		for (Card i : deck) {
			if (i == c) {
				return true;
			}
		}
		return false;
	}

	public int cardFrequency(Card c) {
		int count = 0;

		for (Card i : deck) {
			if (i == c) {
				count++;
			}
		}
		return count;
	}

}
