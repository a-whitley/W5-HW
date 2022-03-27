package week5Assignment;

public class SpacedLogger implements Logger{
	
	public void log(String log) {
		
		System.out.println(log.replace("", " ").trim());
		
	}
	
	public void error(String error) {
		
		System.out.println("ERROR: " + error.replace("", " ").trim());
		
	}

}
