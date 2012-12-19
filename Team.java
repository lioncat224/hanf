


public class Team {

    Players[] players = new Player[2];
    Tablou tablou = new Tablou();
    int score = 0;

    public Team() {
	players[0] = new Player(this,tablou);
	players[1] = new Player(this,tablou);

    }


    public Player getPlayer(int i) {
	return players[i];
    }

    public Tablou getTablou() {
	return tablou;
    }

    public int getScore() {
	return score;
    }

    public void updateScore(int i) {
	score += i;
    }



}