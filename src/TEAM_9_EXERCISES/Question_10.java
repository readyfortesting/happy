package TEAM_9_EXERCISES;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
	
		
		/* Kullan�c�dan �� basamakl� bir say� girmesini ve 
		 * bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.
		 * 
		 * Ask the user to enter a three-digit number and 
		 * find the sum of its digits.
		 */
		
		// Bir say�n�n rakamlar� toplam� basamak de�erleri toplam� demektir.

			// 564 sayisinin  basamak degerleri toplamina bakalim
		
		
		 //*** Biz 3 basamakli bir tam sayinin basamaklarini bulmak icin ilk �nce MOD 10 al�p daha sonra 10'a b�leriz, tekrar mod 10 alip tekrar 10'a b�leriz.
		
		/* 5 yuzler basamagi  bulmak i�in elimizdeki 56 sayisini tekrar 10'a b�leriz 5 sayisini elde ederiz,YUZLER basamagini bulmus oluruz.
		 * 6 onlar basamagini bulmak icin 564 sayisini 10'a boleriz 56 kalir, 56'nin mod 10'u 6 olur,ONLAR basamagini bulmus oluruz. 
		 * 4 birler basamagini bulmak icin bu sayiyi 10'a b�lerim kalani alirim,kalan B�RLER basamagini verir,yani MOD 10
		 */
								
			int sayi=564; // �ncelikle bir de�i�ken olu�tural�m ve 3 basamakli bir sayi atayalim
		
			// ilk �nce bu sayinin B�RLER BASAMAG�N� bulalim
			
			int birler = sayi % 10; // 5 ,  564'� 10'a b�l�p kalanini aliriz,yani mod 10, Mod 10 demek 10'a b�l kalani al getir demek
			
			// daha sonra bu sayiyi 10'a b�leriz, 564 10'a b�l�n�nce  56 olur.
			 sayi/=10; 
			
			// ONLAR BASAMAG�N� bulmak icin tekrar MOD 10  aliriz.
			 // 56'nin mod 10'u 6 dir, onlar basamagini da bulmus olduk
			int onlar = sayi % 10;
			
			// SAY�Y� TEKRAR 10'a b�leriz
			 sayi/=10;
			
			
			//Y�ZLER BASAMAG�N� BULMAK icin de
			int yuzler = sayi % 10; // 5
			
			System.out.println("Birler basamagi : " + birler);
			System.out.println("Onlar basamagi : " + onlar);
			System.out.println("Yuzler basamagi : " + yuzler);
			
			System.out.println("Basamak degerleri toplami : " + (birler+onlar+yuzler));
			
		
}
}