public class Exercise30_Tester {
	String greeting;
	String greeting2;
	Exercise30_Tester(String st, String ed) {
		greeting = st;
		greeting2 = ed;
	}
	Exercise30_Tester(String st) {
		greeting = st;
	}
	Exercise30_Tester(Exercise30_Tester init )
	{
	      // initialize the new object's greeting to the same
	      // as that of the init parameter
		String thisString = new String(this.greeting);
		flip(thisString);
		greeting = thisString;
	}
	
	void speak()                                     
	  { 
	    System.out.println(greeting);
	    if(greeting2 != null) {
	    	System.out.println(greeting2);
		}
	  }
	void speak2()                                     
	  { 
		for(int i = 0; i < greeting.length(); i++) {
			System.out.println(greeting);
		}
	    if(greeting2 != null) {
	    	System.out.println(greeting2);
		}
	  }
	String flip(String thisString) { 
		String modified = thisString.toUpperCase(); 
		return modified;
	}
}
