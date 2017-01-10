import java.util.Scanner;

public class Exercise16_1 {
	public static void main(String args[]) {
		System.out.println("How many integers will be added:");
		Scanner inte = new Scanner(System.in);
		int total = inte.nextInt();
		int fin = 0;
		for(int i = total; i >= 1; i--) {
			System.out.println("Enter an integer:");
			fin = fin + inte.nextInt();
		}
		System.out.println("The sum is " + fin);
	}
}
