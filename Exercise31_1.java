
public class Exercise31_1 {
	public static void main(String[] args) {
		Car car1 = new Car(0, 5, 5);
		Car car2 = new Car(0, 50, 1);
		System.out.println(car1.gasHog() + " " + car2.gasHog()+ " "+ car1.economyCar()+ " "+car2.economyCar());
	}
}
