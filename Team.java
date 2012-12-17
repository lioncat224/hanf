


public class Team {

    Players[] players = { new Player(), new Player() };
    Tablou tablou = new Tablou();
    int score = 0;

    public Team() {

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