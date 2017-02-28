
public class Car {
	double startMile, endMile, gallons;
	Car(double first, double last, double gas) {
		startMile = first;
		endMile = last;
		gallons = gas;
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
}
