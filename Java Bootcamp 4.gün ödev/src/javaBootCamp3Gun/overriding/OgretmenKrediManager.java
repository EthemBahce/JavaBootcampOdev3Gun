package javaBootCamp3Gun.overriding;

public class OgretmenKrediManager extends BaseKrediManager {

	@Override
	public double hesapla(double tutar) {
		
		System.out.println("��retmenler i�in hesapland�");
		return tutar * 1.25;
	}

	
}
