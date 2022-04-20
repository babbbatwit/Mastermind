import java.util.ArrayList;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class HitAndBlows {

	private Circle mark1;
	private Circle mark2;
	private Circle mark3;
	private Circle mark4;
	private VBox container;
	private ArrayList<Integer> countedForIndexs = new ArrayList<Integer>(0);
	private int hits;
	private int blows;
	public HitAndBlows(Circle m1, Circle m2, Circle m3, Circle m4, VBox v) {
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		mark4 = m4;
		mark1.setFill(Color.WHITE);
		mark2.setFill(Color.WHITE);
		mark3.setFill(Color.WHITE);
		mark4.setFill(Color.WHITE);
		container = v;
		container.setOpacity(0);
		hits = 0;
		blows = 0;
	}

	public HitAndBlows() {
		this.container.setOpacity(0);
	}
	public void setHits(int i) {
		hits = i;
	}
	public void setBlows(int i) {
		blows = i;
	}
	
	public void hits(Tile t1, Tile answer){
		for(int i = 1; i <= 4; i++) {
			if(t1.getPinsColor(i) == answer.getPinsColor(i) && !countedForIndexs.contains(i)) {
				hits += 1;
				countedForIndexs.add(i);
			}
		}
	}
	
	public void blows(Tile t1, Tile answer) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j != i) {
					if(t1.getPinsColor(i) == answer.getPinsColor(j) && !countedForIndexs.contains(j)) {
						blows += 1;
						countedForIndexs.add(j);
					}
				}
			}
		}
	}
	
	
	public void displayColors() {
		int tempHits = hits;
		int total = hits + blows;
		Circle[] circArr = {mark1,mark2,mark3,mark4};
		for(int i = 0; i < total; i++) {
			if(tempHits > 0) {
				circArr[i].setFill(Color.GREEN);
				tempHits -= 1;
			}
			else {
				circArr[i].setFill(Color.YELLOW);
			}
		}
	}
	public void setOpacity(double i) {
		container.setOpacity(i);
	}
}
