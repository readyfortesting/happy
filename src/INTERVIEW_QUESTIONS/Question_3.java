package INTERVIEW_QUESTIONS;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int bolen=0;
		
		for (int i = 2; i <= sayi; i++) {
			if(sayi%i==0) {
				bolen++;
			}
		}
			if(bolen==1) {
				System.out.println(" Girdiginiz " +sayi+ " bir asal sayidir");
			}else {
				System.out.println("Girdiginiz " +sayi+ " asal sayi degildir");
			}
	}

}
