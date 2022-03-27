package week5Assignment;

public class AsteriskLogger implements Logger{
	
	public void log(String log) {
		System.out.println("***" + log + "***");
	}
	
	public void error(String error) {
		
		
		for (int count = 0; count < (error.length() + 13); count ++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("***ERROR: " + error + "***");
		for (int count = 0; count < (error.length() + 13); count ++) {
			System.out.print("*");
		}
		
	}

}
