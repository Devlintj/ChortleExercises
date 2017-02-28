
public class Car {
	double startMile, endMile, gallons;
	Car(double first, double last, double gas) {
		startMile = first;
		endMile = last;
		gallons = gas;
	}
	
	Car(int miles) {
		startMile = 0;
		endMile = miles;
	}
	
	public double calculateMPG() {
		double mpg = (endMile - startMile) / gallons;
		return mpg;
	}
	
	public boolean gasHog() {
		double mpg = this.calculateMPG();
		if(mpg < 15.0) {
			return true;
		}
		return false;
	}
	
	public boolean economyCar() {
		double mpg = this.calculateMPG();
		if(mpg > 30.0) {
			return true;
		}
		return false;
	}
	public void fillUp(int miles, double gas) {
		startMile = endMile + 0;
		endMile+=miles;
		gallons = gas;
	}
}
