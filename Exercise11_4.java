import java.util.Scanner;


public class Exercise11_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X");
		double x = input.nextDouble();
		System.out.println("Enter Y");
		double y = input.nextDouble();
		System.out.println("Arithmetic mean: " + (x+y)/2);
		System.out.println("Harmonic mean: " + 2 / ((1/x) + (1/y)));
	}
}
