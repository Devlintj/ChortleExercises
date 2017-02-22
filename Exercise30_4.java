
public class Exercise30_4 {
	public static void main(String[] args) {
		Exercise30_Tester object1 = new Exercise30_Tester("why hello sir");
		Exercise30_Tester object2 = new Exercise30_Tester(object1);
		object2.speak();
	}
}
