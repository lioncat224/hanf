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
    Team[] teams = { new Team(), new Team() };
    

    public Game() {
	
	

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

	boolean roundFinished = false;

	while (!roundFinished) {
	    team[0] //to do - invoke player
	    





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












}



















