import java.util.Scanner;

public class Exercise16_3 {
	public static void main(String args[]) {
		System.out.println("Enter N");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		double sum = 0;
		double sumsquare = 0;
		double placehold = 0;
		for(int i = num; i > 0; i--) {
			System.out.println("Enter float:");
			placehold = n.nextDouble();
			sum = sum + placehold;
			sumsquare = sumsquare + (placehold * placehold);
		}
		double avg = sum/num;
		double avgSquare = sumsquare/num;
		double sd = Math.sqrt((avgSquare) - (avg * avg));
		System.out.println("standard deviation is: " + sd);
	}
}
