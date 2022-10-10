package javaBootCamp3Gun.polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	CustomerManager(BaseLogger baseLogger){
		this.baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("M��teri eklendi");
		baseLogger.Log("Mersin");
		
		
	}
	
	
 
}
