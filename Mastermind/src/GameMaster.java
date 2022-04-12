import java.util.Random;
public class GameMaster {

	public Tile AnswerGen() {
		int[] numArr = noRepeatBoard();
		Pin p1 = new Pin(numArr[0]);
		Pin p2 = new Pin(numArr[1]);
		Pin p3 = new Pin(numArr[2]);
		Pin p4 = new Pin(numArr[3]);
		Tile answerTile = new Tile(p1,p2,p3,p4);
		return answerTile;
	}
	
	public int[] noRepeatBoard(){
		boolean isTaken = false;
		int[] generatedArray = new int[4];
		Random rand = new Random();
		
		for (int i = 0; i < 4;) {
			int tempNum = rand.nextInt(6) + 1;
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
		return generatedArray;
	}
	//currently unused but could be used for harder version of the game
	public int[] repeatingBoard(){
		int[] generatedArray = new int[4];
		Random rand = new Random();
		
		for (int i = 0; i < 4;) {
			generatedArray[i] = rand.nextInt(6) + 1;
		}
		return generatedArray;
	}
}
