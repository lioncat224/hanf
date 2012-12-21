/* players have :

11 cards to start in thier hand and 11 in thier foot

turn actions:
phase 1 - must draw two cards OR pick from discard pile before they begin their turn

phase 2 - play on tablou - can have no action 
    -- ends by discarding

 */

import java.util.Scanner;

public class Player {

	Deck hand = new Deck();
	Deck foot = new Deck();
	String name;
	Team team;
	Tablou tablou;

	public Player(Team t, Tablou b) {
		this.team = t;
		this.tablou = b;

		Scanner scan = new Scanner(System.in);
		System.out.print("What is your name? ");
		name = scan.nextLine();
		scan.close();

	}

	public Team getTeam() {
		return team;
	}

	public Tablou getTablou() {
		return tablou;
	}

	public String toString() {
		return name;
	}

}