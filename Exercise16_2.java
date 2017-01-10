import java.util.Scanner;

public class Exercise16_2 {
	public static void main(String args[]) {
		System.out.println("Enter N");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		double sum = 0;
		for(int i = num; i > 0; i--) {
			sum = sum + (1.0/i);
		}
		System.out.println("Sum is: " + sum );
	}
}
