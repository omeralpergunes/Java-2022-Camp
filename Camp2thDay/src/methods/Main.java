package methods;

public class Main {

	public static void main(String[] args) {

	}
	public static void sayiBulmaca() {
		int sayilar[] = new int[] {1,2,5,7,9,0};
		int aranan = 6;
		boolean varMi = false;
		
		for(int sayi: sayilar) {
			if(sayi==aranan) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Sayı mevcuttur" + aranan);
		}else {
			mesajVer("Sayı mevcut değildir " + aranan);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
