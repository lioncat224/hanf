/* check out this enum! */


public enum Card {
    /*
      threes = evil = -100
      jokers = wild = 50
      twos = wild = 20
      aces = 20
      8 - K = 10
      4 - 7 = 5
    */

    JOKER(50,true), TWO(20,true), THREE(-100,false), ACE(20,false), KING(10,false), QUEEN(10,false), JACK(10,false), TEN(10,false), NINE(10,false), EIGHT(10,false), SEVEN(5,false), SIX(5,false), FIVE(5,false), FOUR(5,false);


    private final int pointValue;
    private final boolean isWild;

    Card(int pointValue, boolean isWild) {
	this.pointValue = pointValue;
	this.isWild = isWild;
    }

    public int getPointValue() {
	return this.pointValue;
    }

    public boolean isWild() {
	return this.isWild;
    }

    public Card fromString(String card) throws NotFoundException {
	for (Card c: Card.values()) {
	    if (card.equalsIgnoreCase(c.name())) {
		return c;
	    }
	}
	throw new NotFoundException("Card does not exist: "+card);
    }



}