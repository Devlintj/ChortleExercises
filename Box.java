
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
	
	double volume() {
		double volume = width * height * length;
		return volume;
	}
	double area() {
		double area = (width * length * 2) + (width * height * 2) + (height * length * 2);
		return area;
	}
	
	double length() {
		return length;
	}
	
	double height() {
		return height;
	}
	
	double width() {
		return width;
	}
}
