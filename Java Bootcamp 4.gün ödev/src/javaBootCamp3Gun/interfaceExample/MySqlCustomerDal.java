package javaBootCamp3Gun.interfaceExample;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void access() {
		System.out.println("mysql eriþimi saðlandý");
		
	}

	@Override
	public void delete() {
		System.out.println("mysql veritabaný nesnesi silindi");
		
	}
	
	 

}
