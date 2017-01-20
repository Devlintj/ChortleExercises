import java.util.Scanner;


public class Exercise11_1 {
	public static void main(String[] args){
		Scanner watt= new Scanner(System.in);
		System.out.println("Enter cost per kilowatt-hour in cents");
		double cents = watt.nextDouble();
		System.out.println("Enter kilowatt-hours used per year");
		int peryear = watt.nextInt();
		System.out.println("Annual cost: " + cents * peryear);
	}
}
