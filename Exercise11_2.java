import java.util.Scanner;

public class Exercise11_2 {
	public static void main(String args[]) {
		System.out.println("Enter the number of seconds:");
		Scanner time = new Scanner(System.in);
		double seconds = time.nextDouble();
		System.out.println("Distance: " + (.5 * 32.174 * seconds * seconds));
	}
}
