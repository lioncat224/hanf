/*

takes a card and a row - places it on the row the player specified but checks if its the matching number - unless its a 2 or a joker

makes 7 cards in a row into a book - red if all the number - black if wilds/not all the same
 


 */


import java.util.*;


public class Tablou {
    //hashmap will contain place holders for all card face values ( 4 - A ) 
    HashMap<Card,Book> tablou = new HashMap<Card,Book>();
    
    
    public Tablou() {
	for (Card c : Card.values()) {
	    tablou.put(c, new Book(c));
	}

    }

    public boolean isTablouOpen() {
	return tablou.isEmpty();
    }
    
    public boolean isBookOpen(Card c) {
	return tablou.get(c).isOpen();
    }
    
    public void addCards(List<Card> selected, Card bookKey) {
	for (Card c : selected) {
	    (tablou.get(bookKey)).addCard(c);
	}
    }
    


}