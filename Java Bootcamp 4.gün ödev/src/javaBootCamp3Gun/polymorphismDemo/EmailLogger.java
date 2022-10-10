package javaBootCamp3Gun.polymorphismDemo;

public class EmailLogger extends BaseLogger {

	@Override
	public void Log(String message) {
		
		System.out.println("Email Logger :" + message);
	}
	
	

}
