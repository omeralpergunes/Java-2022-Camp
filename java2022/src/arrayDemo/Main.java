package arrayDemo;

public class Main {

	public static void main(String[] args) {

		String ogrenci1 = "Engin";
		String ogrenci2 = "Salih";
		String ogrenci3 = "Kerem";
		String ogrenci4 = "Mehmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ömer";
		ogrenciler[1] = "Alper";
		ogrenciler[2] = "Atakan";
		ogrenciler[3] = "Nazif";

		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
		

	}

}
