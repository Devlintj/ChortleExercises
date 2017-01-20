import java.util.Scanner;


public class Exercise10_2 {
	public static void main(String[] args){
		System.out.println("Input the cents: ");
		Scanner centin = new Scanner(System.in);
		int coin = centin.nextInt();
		int dollar = 0;
		for(int i = coin; coin >= 100; i++) {
			coin = coin - 100;
			dollar++; 
		}
		System.out.println("That is " + dollar + " dollars and " + coin + " cents.");
	}
}
