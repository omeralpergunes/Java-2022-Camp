package recapDemo2;

public class Main {

	public static void main(String[] args) {
	double[] myList = {1.2,1.3,2.4,5.3,7.4,9.1,4,7.24};
		
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			
			if(number>max) {
				max = number;
			}
			
			total += number;
			System.out.println(number);
		}
		
		System.out.println("Toplam: "+ total);
		System.out.println("En Büyük: " +max);
		
	}
		
 	}

