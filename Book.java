
// cards of the same face value, execpt wilds
// must have one less wild than natural cards at all times
// must have at least 3 to open a book
// closes when it has 7 
// red if all naturals, black if wild card(s)


public class Book {

    Card card;

    int total = 0;
    int naturals = 0;
    int wilds = 0;
   
    public Book(Card c) {
	this.card = c;
	
    }

    public boolean isClean() {
	return wilds == 0;
    }

    public boolean isOpen() {
	return total > 0;
    }



}