import java.util.Random;
public class GameMaster {

	private static int round;
	private static boolean hasWon;
	
	public static void intialize() {
		round = 1;
		
	}

	public static boolean winChecker(Tile t1, Tile answer) {
		hasWon = t1.equals(answer);
		return hasWon;
	}
	
	public static int hits(Tile t1, Tile answer){
		int hits = 0;
		for(int i = 1; i <= 4; i++) {
			if(t1.getPinsColor(i) == answer.getPinsColor(i)) {
				hits += 1;
			}
		}
		return hits;
	}
	
	public static int blows(Tile t1, Tile answer) {
		int blows = 0;
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j != i) {
					if(t1.getPinsColor(i) == answer.getPinsColor(j)) {
						blows += 1;
					}
				}
			}
		}
		return blows;
	}

	public static void increaseRound() {
		round += 1;
	}
	
	public static int getRound() {
		return round;
	}
	public static boolean checkHasWon() {
		return hasWon;
	}
	public static void setWin() {
		hasWon = true;
	}
}
