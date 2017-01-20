import java.util.Scanner;


public class Exercise10_4 {
	public static void main(String[] args){
		Scanner info = new Scanner(System.in);
		System.out.println("what is the Voltage? ");
		int voltage = info.nextInt();
		System.out.println("what is the Resistance? ");
		int resistance = info.nextInt();
		System.out.println("the current is: " + (voltage + 0.0)/resistance + " amps.");
	}
}
