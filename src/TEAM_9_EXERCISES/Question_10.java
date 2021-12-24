package TEAM_9_EXERCISES;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
	
		
		/* Kullanýcýdan üç basamaklý bir sayý girmesini ve 
		 * bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.
		 * 
		 * Ask the user to enter a three-digit number and 
		 * find the sum of its digits.
		 */
		
		// Bir sayýnýn rakamlarý toplamý basamak deðerleri toplamý demektir.

			// 564 sayisinin  basamak degerleri toplamina bakalim
		
		
		 //*** Biz 3 basamakli bir tam sayinin basamaklarini bulmak icin ilk önce MOD 10 alýp daha sonra 10'a böleriz, tekrar mod 10 alip tekrar 10'a böleriz.
		
		/* 5 yuzler basamagi  bulmak için elimizdeki 56 sayisini tekrar 10'a böleriz 5 sayisini elde ederiz,YUZLER basamagini bulmus oluruz.
		 * 6 onlar basamagini bulmak icin 564 sayisini 10'a boleriz 56 kalir, 56'nin mod 10'u 6 olur,ONLAR basamagini bulmus oluruz. 
		 * 4 birler basamagini bulmak icin bu sayiyi 10'a bölerim kalani alirim,kalan BÝRLER basamagini verir,yani MOD 10
		 */
								
			int sayi=564; // Öncelikle bir deðiþken oluþturalým ve 3 basamakli bir sayi atayalim
		
			// ilk önce bu sayinin BÝRLER BASAMAGÝNÝ bulalim
			
			int birler = sayi % 10; // 5 ,  564'ü 10'a bölüp kalanini aliriz,yani mod 10, Mod 10 demek 10'a böl kalani al getir demek
			
			// daha sonra bu sayiyi 10'a böleriz, 564 10'a bölününce  56 olur.
			 sayi/=10; 
			
			// ONLAR BASAMAGÝNÝ bulmak icin tekrar MOD 10  aliriz.
			 // 56'nin mod 10'u 6 dir, onlar basamagini da bulmus olduk
			int onlar = sayi % 10;
			
			// SAYÝYÝ TEKRAR 10'a böleriz
			 sayi/=10;
			
			
			//YÜZLER BASAMAGÝNÝ BULMAK icin de
			int yuzler = sayi % 10; // 5
			
			System.out.println("Birler basamagi : " + birler);
			System.out.println("Onlar basamagi : " + onlar);
			System.out.println("Yuzler basamagi : " + yuzler);
			
			System.out.println("Basamak degerleri toplami : " + (birler+onlar+yuzler));
			
		
}
}