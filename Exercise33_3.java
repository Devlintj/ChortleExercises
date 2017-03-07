
public class Exercise33_3 {
	public static void main(String[] args) {
		Box box1 = new Box(2.5, 5.0, 6.0);
		Box box2 = new Box(box1);
		System.out.println( "Area: " + box2.area() + " volume: " + box2.volume());
		System.out.println("length: " + box2.length() + " height: " + box2.height() + " width: " + box2.width());
	}
}
