import java.util.Scanner;


public class Exercise30_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a greeting:");
		Exercise30_3_Tester object = new Exercise30_3_Tester(input.next());
		object.speak();
	}
}
