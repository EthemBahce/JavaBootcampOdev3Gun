package javaBootCamp3Gun.overriding;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<BaseKrediManager> krediManager = new ArrayList<BaseKrediManager>();
		krediManager.add(new TarimKrediManager());
		krediManager.add(new OgretmenKrediManager());
		
		for (BaseKrediManager baseKrediManager : krediManager) {
			System.out.println(baseKrediManager.hesapla(1745));
		}

	}

}
