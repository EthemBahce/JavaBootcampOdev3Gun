package javaBootCamp3Gun.overriding;

public class TarimKrediManager extends BaseKrediManager {

	@Override
	public double hesapla(double tutar) {
		
		System.out.println("Tarım kredisi için hesaplanan değer");
		return tutar * 1.10;
		
	}

	
}
