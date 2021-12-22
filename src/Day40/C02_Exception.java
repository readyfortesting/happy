package Day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*kullanicidan istedigi kadar sayi alip bu sayilari toplayan bir program yapiniz
		 * 
		 * sayi girisini bitrmek icin Q'ya basiniz
		 */
		int sayi =0;
		int toplam=0;
		int count=0;
		String secim="";
		Scanner scan = new Scanner (System.in);
		
		// InputMismatchException
		
		try {
			while(count<10000) {
				System.out.println("lutfen toplamak icin bir sayi yaziniz \nBitirmek icin sayi disinda bir tusa basiniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
			}
		}catch(InputMismatchException e) {
			System.out.println("Girdiginiz "+ count +" adet sayinin toplami :" +  toplam);
			
		}
		
			
		}
		
		
		
	}


