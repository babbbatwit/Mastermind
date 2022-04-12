
public class Pin {
	private int color;
	
	public Pin(int c) {
		color = c;
	}
	public Pin() {
		color = 0;
	}
	public int getColor() {
		return color;
	}
	public String getColorName() {
		switch(color) {
		case 1:
			return "Blue";
		case 2:
			return "Red";
		case 3:
			return "Green";
		case 4:
			return "Yellow";
		case 5:
			return "Purple";
		case 6:
			return "Black";
		default:
			return "Empty";
		}
	}
}
