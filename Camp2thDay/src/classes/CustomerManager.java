package classes;

public class CustomerManager {

	public void Add() {
		System.out.println("Müşteri eklendi");
	}
	public void Delete() {
		System.out.println("Müşteri silindi");
	}
	public void Update() {
		System.out.println("Müşteri güncellendi");
	
	//value 
		
		int sayi1 =10;
		int sayi2 =20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int [] sayilar1 = new int []{1,2,3};
		int [] sayilar2 = new int []{4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);

	
	}
	
	
}
