
public class Box {
	private double width, height, length;
	Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	Box(double side) {
		width = side;
		height = side;
		length = side;
	}
	
	Box(Box oldBox) {
		this.width = oldBox.width();
		this.length = oldBox.length();
		this.height = oldBox.height();
	}
	
	double volume() {
		double volume = width * height * length;
		return volume;
	}
	double area() {
		return topArea() + sideArea() + faceArea();
	}
	
	private double topArea() {
		return height * length * 2;
	}
	
	private double sideArea() {
		return width * length * 2;
	}
	
	private double faceArea() {
		return width * height * 2;
	}
	
	public double length() {
		return length;
	}
	
	public double height() {
		return height;
	}
	
	public double width() {
		return width;
	}
}
