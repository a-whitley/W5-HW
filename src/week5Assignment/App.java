package week5Assignment;

public class App {
	
	public static void main(String args[]) {

		Logger logger1 = new AsteriskLogger();
		logger1.log("Hello");

		System.out.println();

		Logger logger2 = new AsteriskLogger();
		logger2.error("testing one two");

		System.out.println();
		System.out.println();

		Logger logger3 = new SpacedLogger();
		logger3.log("random");

		System.out.println();

		Logger logger4 = new SpacedLogger();
		logger4.error("computers");

	}

}