package javaBootCamp3Gun.polymorphismDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		
		for(BaseLogger logger : loggers) {
			logger.Log("Ýstanbul");
		}
		
		System.out.println("---------------------------------------");
		
		List<BaseLogger> loggers2 = new ArrayList<BaseLogger>();
		loggers2.add(new DatabaseLogger());
		loggers2.add(new FileLogger());
		loggers2.add(new EmailLogger());
		loggers2.add(new ConsoleLogger());
		
		for (BaseLogger baseLogger : loggers2) {
			baseLogger.Log("Adana");
		}
		*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		

	}

}
