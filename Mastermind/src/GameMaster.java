import java.util.Random;
public class GameMaster {

	private static int round;
	private static boolean gameOver;

	public static boolean winChecker(Tile t1, Tile answer) {
		gameOver = t1.equals(answer);
		return gameOver;
	}

	public static void increaseRound() {
		round += 1;
	}
	
	public static int getRound() {
		return round;
	}
	public static boolean checkGameOver() {
		return gameOver;
	}
	public static void setGameOver() {
		gameOver = true;
	}
}
