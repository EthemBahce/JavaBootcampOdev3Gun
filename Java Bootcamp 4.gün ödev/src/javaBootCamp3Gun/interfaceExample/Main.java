package javaBootCamp3Gun.interfaceExample;

public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal1 = new MySqlCustomerDal();
		ICustomerDal customerDal2 = new OracleCustomerDal();
		
		customerDal1.access();
		customerDal2.access();
		customerDal1.delete();
		customerDal2.delete();

	}

}
