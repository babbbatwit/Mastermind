import javafx.scene.layout.VBox;

public class Tile {

	private Pin p1;
	private Pin p2;
	private Pin p3;
	private Pin p4;
	private boolean isShown;
	private VBox container;
	
	public Tile(Pin p1, Pin p2, Pin p3, Pin p4, VBox container) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.container = container;
	}
	public Tile(Pin p1, Pin p2, Pin p3, Pin p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public String toString() {
		String returnedString = String.format("%s, %s, %s, %s", p1.getColorName(), p2.getColorName(), p3.getColorName(), p4.getColorName());
		return returnedString;
	}
	public void setOpacity(double i) {
		container.setOpacity(i);
	}
}
