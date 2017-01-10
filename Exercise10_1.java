import java.util.Scanner;


public class Exercise10_1 {
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.println("Input the radius: ");
		int rad = radius.nextInt();
		double area = rad * rad * Math.PI;
		System.out.println("the radius is: " + rad + " The Area is: " + area);
	}
}
