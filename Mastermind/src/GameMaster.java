import java.util.Random;
public class GameMaster {

	public Tile AnswerGen() {
		boolean isTaken = false;
		int[] generatedArray = new int[4];
		Random rand = new Random();
		
		for (int i = 0; i < 4;) {
			int tempNum = rand.nextInt(7);
			for (int j = 0; j < 4; j++) {
				if (generatedArray[j] == tempNum) {
					isTaken = true;
				}
			}
			if (isTaken == false) {
				generatedArray[i] = tempNum;
				i++;
			} else {
				isTaken = false;
			}
		}
		Pin p1 = new Pin(generatedArray[0]);
		Pin p2 = new Pin(generatedArray[1]);
		Pin p3 = new Pin(generatedArray[2]);
		Pin p4 = new Pin(generatedArray[3]);
		Tile answerTile = new Tile(p1,p2,p3,p4);
		return answerTile;
	}
}
