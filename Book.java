
// cards of the same face value, execpt wilds
// must have one less wild than natural cards at all times
// must have at least 3 to open a book
// closes when it has 7 
// red if all naturals, black if wild card(s)


public class Book {

    Card card;
    int naturals = 0;
    int wilds = 0;
   
    public Book(Card c) {
	this.card = c;
	
    }

    public int total() {
	return naturals + wilds;
    }

    public boolean isClean() {
	return wilds == 0;
    }

    public boolean isOpen() {
	return total >= 3 && total <= 7;
    }

    // book is closed but you can play naturals on it for extra points
    // public boolean forPoints() {
    // *** maybe will need this method but right now ,,, do not.?*	
    //}

    public boolean addCard(Card c) {
	if (c == card) {
	    naturals++;
	    return true;
	}
	else if (c.isWild() && wilds < (naturals - 1) && isOpen()) {
	    wilds++;
	    return true;
	}
	//error checking
	else if (c.isWild() && !isOpen()) {
	    System.out.println("\nCannot play wilds on closed book.");
	    return false;
	}
	else if (c.isWild() && !(wilds < (naturals - 1))) {
	    System.out.println("\nToo many wilds.");
	    return false;
	}
	else if (!c.isWild() && c != card) {
	    System.out.println("\nDoes not have the same face value (and is not wild).");
	    return false;
	}
	else {
	    System.out.println("This card cannot be played on this book for some mysterious reason.");
	    return false;
	}
    }
	
		 
	//if success -- ccard can be played absolutely end of story
	//...add the card
	// else if (too many wilds)
	//.... inform user)
	// else if (playing wild and book is closed)
	//.... inform user
	// else if (card is not wild and card does not match book
	//.... 
	



}