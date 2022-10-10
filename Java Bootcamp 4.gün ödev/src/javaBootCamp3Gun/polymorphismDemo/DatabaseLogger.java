package javaBootCamp3Gun.polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	
	@Override
	public void Log(String message) {
		System.out.println("Database Logger : " + message);
	}
	

}
