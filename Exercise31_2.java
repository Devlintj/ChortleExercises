
public class Exercise31_2 {
	public static void main(String[] args) {
		Car car = new Car(57);
		car.fillUp(10, 4);
		System.out.println(car.calculateMPG() + " " + car.gasHog() + " " + car.economyCar());
		car.fillUp(40, 1);
		System.out.println(car.calculateMPG() + " " + car.gasHog() + " "+ car.economyCar());
		
	}
}
