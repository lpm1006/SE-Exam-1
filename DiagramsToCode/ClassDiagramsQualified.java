package DiagramsToCode;

import java.util.Map;

/* Coverting the following many to many class diagram to code:
 * 
 * +--------------+                      +-----------+
 * |              |----------+      0..1 |           |
 * |    League    | nickName |-----------|  Player   |
 * |              |----------+           |           |
 * +--------------+                      +-----------+
 * 
 */

class League {
	private Map<String, Player2> players;
	
	public void addPlayer(String nickName, Player2 p) {
		if(!players.containsKey(nickName)) {
			players.put(nickName, p);
			p.addLeague(nickName, this);
		}
	}
}

class Player2 {
	private Map<League, String> leagues;
	
	public void addLeague(String nickName, League l) {
		if(!leagues.containsKey(l)) {
			leagues.put(l, nickName);
			l.addPlayer(nickName, this);
		}
	}
}

public class ClassDiagramsQualified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
