package javaBootCamp3Gun.polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	CustomerManager(BaseLogger baseLogger){
		this.baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("Müþteri eklendi");
		baseLogger.Log("Mersin");
		
		
	}
	
	
 
}
