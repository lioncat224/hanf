/* dicard pile needs to show the top 7 cards

needs to be able to have the top 7 cards removed 

needs an indicator (return boolean) to note that the player has drawn so he can continue his turn

needs to know that the player has two cards of the same value in his hand as the top of the discard pile (cannot be wilds)

cannot pick up wilds or threes

*/



public class DiscardPile extends Deck {

    // maybe constructor?


    // Game's job to make player draw 7 cards
    // must use this signature to override Deck drawCard method
    //// want this method to make user draw from the BOTTOM rather than the top because cards are added to the end of the arraylist (que) rather than a stack

    public Card drawCard() {

	return deck.remove(deck.size()-1);
    }

    public Card topCard() {
	// for the program to grab the top card of the discard pile and check if the player can take it (this will be done by the game)	
	return deck.get(deck.size()-1);
    }

    public Deck drawXCards(int n) {
	Deck pickupCards = new Deck();
	
	// if the deck isn't big enough, only draw as many cards as there are	
	if (n < deck.size()) {
	    n = deck.size();
	}

	for (int i = 0; i < n; i++) {
	    pickupCards.addCard(drawCard());
	} 
	
	return pickupCards;
    }


}