package javaBootCamp3Gun.interfaceExample;

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void access() {
		System.out.println("oracle eri�ti");
		
	}

	@Override
	public void delete() {
		System.out.println("oracle veritaban� nesnesi silindi");
		
	}

}
