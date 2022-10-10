package javaBootCamp3Gun.interfaceExample;

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void access() {
		System.out.println("oracle eriþti");
		
	}

	@Override
	public void delete() {
		System.out.println("oracle veritabaný nesnesi silindi");
		
	}

}
