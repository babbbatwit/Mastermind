
public class Tile {

	private Pin p1;
	private Pin p2;
	private Pin p3;
	private Pin p4;
	
	public Tile(Pin p1, Pin p2, Pin p3, Pin p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	public String toString() {
		String returnedString = String.format("%s, %s, %s, %s", p1.getColorName(), p2.getColorName(), p3.getColorName(), p3.getColorName());
		return returnedString;
	}
}
