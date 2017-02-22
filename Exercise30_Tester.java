public class Exercise30_Tester {
	String greeting;
	Exercise30_Tester(String st) {
	    greeting = st;
	
	    for(int i = 0; i < greeting.length(); i++) {
	    	speak();
	    }
	}
	void speak()                                     
	  { 
	    System.out.println(greeting);
	  }
}
