package javaBootCamp3Gun.interfaceExample;

public class MySqlCustomerDal implements ICustomerDal{

	@Override
	public void access() {
		System.out.println("mysql eri�imi sa�land�");
		
	}

	@Override
	public void delete() {
		System.out.println("mysql veritaban� nesnesi silindi");
		
	}
	
	 

}
