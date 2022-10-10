package javaBootCamp3Gun.methodOverloading;

public class Main {

	public static void main(String[] args) {


		
		DortIslem dortIslem = new DortIslem();
		DortIslem dortIslem2 = new DortIslem();
		int b = dortIslem2.topla1(10, 20, 30);
		int a = dortIslem.topla2(10, 20);
		
		
		System.out.println(a + b);

	}

}
