package DiagramsToCode;

import java.util.ArrayList;
import java.util.List;

/* Coverting the following many to many class diagram to code:
 * 
 * +--------------+             +-----------+
 * |              | *         * |           |
 * |  Tournament  |-------------|  Player   |
 * |              |             |           |
 * +--------------+             +-----------+
 * 
 */

class Tournament {
	private List<Player> players;
	
	public Tournament() {
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p) {
		if(!players.contains(p)) {
			players.add(p);
			p.addTournament(this);
		}
	}
}

class Player {
	private List<Tournament> tournaments;
	
	public Player() {
		tournaments = new ArrayList<Tournament>();
	}
	
	public void addTournament(Tournament t) {
		if(!tournaments.contains(t)) {
			tournaments.add(t);
			t.addPlayer(this);
		}
	}
}

public class ClassDiagramsManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
