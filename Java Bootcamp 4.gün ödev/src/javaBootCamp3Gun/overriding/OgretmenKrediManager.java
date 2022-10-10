package javaBootCamp3Gun.overriding;

public class OgretmenKrediManager extends BaseKrediManager {

	@Override
	public double hesapla(double tutar) {
		
		System.out.println("Öğretmenler için hesaplandı");
		return tutar * 1.25;
	}

	
}
