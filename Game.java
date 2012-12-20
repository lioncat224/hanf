/* this is one game, consisting of 4 rounds
controlls the board (and everything...)

create jframe
  draw on jpanel representation of the board and the current players hand


responsible for asking board for its state and asking player for hand, then the game can draw itself 

------------

/* there are four rounds in one game 


each round has different initial point values


responsibilities:

keep track of whose turn it is, who is taking the next turn


methods:
taketurn - take something about game state (board?) - round will have player take this method (which ever player's turn) 
 ex: player.taketurn(board);


 */


/*  methods defined:

  main(String[] args);
  start();


 */

import java.util.*; 


public class Game { 

    boolean finished = false;
    int[] initialPoints = {50, 90, 120, 150};
    int round = 0;
    Team[] teams = new Team[2];
    Deck drawPile, discardPile;

    public Game() {  
	teams[0] = new Team();
	teams[1] = new Team();
	
    }

    public static void main(String[] args) {
	
	new Game().start();

    }


    public void start() {
	while(!finished) {
	    round(initialPoints[round]);
	    
	}
    }

    public void round(int initialPoints) {
	discardPile = new DiscardPile(); // clears discard pile
	drawPile = fullDeck(); 
	drawPile.shuffle();

	for (int i = 0; i < 11; i++) {
	    for (team t : teams) {
		for (Player p : t) {
		    p.hand.addCard(Deck.drawCard());
		    p.foot.addCard(Deck.drawCard());
		}
       	    }
	}
		
	boolean roundFinished = false;

	while (!roundFinished) {
	    

	    team[0] // invoke player to take its turn;
	    
	  

	    if (/*player has won = tablou has red and black book,
		  no threes in either players hand(foot), 
		  both players on team in their foot, 
		  must discard last card in hand*/) 
		roundFinished = true;

	}

	round++;
       
	if (round > 3)
	    finished = true;	

    }

    public void turn(Player p) {
	//phase 1: player cannot do NAYTHING until they have EITHER drawn 2 cards from drawPile OR drawn top 7 cards from discardPile (as long as top card matches two natural cards in hand AND they must lay it down immediately AND can only use top card to count towards opening tablou if need be

	boolean hasDrawn = false;
	boolean hasDiscarded = false;
	//list of cards they have selected during their turn
	List<Card> selected = new ArrayList<Card>();

	while (!hasDrawn) {
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.print(p+"'s turn. Draw from drawPile or discardPile? ");
	    String input = scan.nextLine();
	    
	    if (input.equals("drawPile")) {
		p.hand.addCard(drawPile.drawCard());
		p.hand.addCard(drawPile.drawCard());
		
		hasDrawn = true;
	    }
	    
	    if (input.equals("discardPile")) {
		// need a way to check if the player has two of the same cards as the top card in discard pile, and that they have the required initial points to open up their tablou using only the top card if neccassry 
		if ((p.hand.cardFrequency(discardPile.topCard()) >= 2))
		    && (p.getTablou().isOpen() || /* (p.getTablou.count() +  ) */ ) {
			
	      		
			hasDrawn = true;
		    }
	    }	
	}
	
	while (!hasDiscarded) {
	    
	    if (!tablou.isOpen()) {
		// have to select enough cards in hand to LEGALLY add up to required initial point value.
		
	    } else {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\nSelect a card: ");
		String input = scan.next();
		Card selectedCard;
		
		for (Card c : p.hand) {
		    if (input.equalsIgnoreCase(c.name())) {
			selectedCard = c;
		    }
		}
		
		if (selectedCard == null) {
		    System.out.print("Not in your hand!!!!!!!!");
		    continue;
		}
		
		System.out.print("\n\nType (1) to select another card, (2) to play selected card(s), (3) to discard: ");
		input = scan.next();
		
		switch (input) {
		case 1:
		    selected.add(selectedCard);
		    break;
		case 2:
		    // play selected card(s) -- add cards in 'selected' arraylist to tablou, they also need to specify which book to play wilds on, also cannot play threes on tablou, also must have selected at least 2 natural w/ one wild to open new book
		    break;
		case 3:
		    discardPile.add(selectedCard);
		    p.hand./*remove method to be written in Deck*/(selectedCard);
		    hasDiscarded = true;
		    break;
		defualt:
		    System.out.println("\n fail.");
		    break;
		}
		   
		

		    
	    }
	    
	}
	
	
    }
    
    public static int count(List<Card> selected) {
	int count = 0;
	for (Card c : selected) {
	    count += c.getPointValue();
	}
	return count;
    }
	
	    

}



















