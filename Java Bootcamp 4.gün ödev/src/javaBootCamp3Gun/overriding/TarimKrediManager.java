package javaBootCamp3Gun.overriding;

public class TarimKrediManager extends BaseKrediManager {

	@Override
	public double hesapla(double tutar) {
		
		System.out.println("Tar�m kredisi i�in hesaplanan de�er");
		return tutar * 1.10;
		
	}

	
}
