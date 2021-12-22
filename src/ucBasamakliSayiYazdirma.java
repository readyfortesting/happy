
public class ucBasamakliSayiYazdirma {

	public static void main(String[] args) {
		//  Print the digits of a 3 digit integer to the console.
		//  345
		//  %10 (mod 10) sayinin BÝRLER basamagini verir
		//  345'i 10'a böleriz 34, 34 sayisinin %10'unu aliriz 4, ONLAR basamagini verir
		//  34 sayisini tekrar 10'a boleriz 3 verir,bu da YUZLER basamagini verir.
		
		//345 %10 =
		// 34 %10 =
		//
		
		int sayi =678 ;
		int birler = sayi%10;
		sayi /= 10;
		
		
		int onlar = sayi % 10 ;
		sayi /= 10;
		
		int yuzler = sayi %10;
		
		System.out.println("Birler basamagi : " + birler); // Birler basamagi : 5
		
		System.out.println("Onlar basamagi : " + onlar); // Onlar basamagi : 4
		
		System.out.println("Yuzler basamagi : " + yuzler); // Yuzler basamagi : 3
		
		System.out.println("Basamaklari toplami : " + (birler+onlar+yuzler)); // Basamaklari toplami : 21
		
		
	}

}
