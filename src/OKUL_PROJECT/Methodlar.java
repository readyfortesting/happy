package OKUL_PROJECT;

import java.util.Scanner;

public class Methodlar {

		public static void anaMenu() {
			Scanner scan = new Scanner(System.in);
			System.out.println("========================\n Ogrenci ve Ogretmen Yonetim Paneli\n============"
					+ "\n1- Ogrenci Islemleri\n2- Ogretmen Islemleri\nQ- Cikis ");
			
			System.out.println("Yapmak istediginiz islemi giriniz");
			char secim = scan.next().toUpperCase().charAt(0);
			
			switch(secim) {
			case'1':
				ogrenciIslemleri();
				break;
			case'2':
				ogretmenIslemleri();
				break;
				
			case'Q':
				cikis();
				break;
				
			default:
			System.out.println("====> Lutfen gecerli giris yapiniz!<=====");
				anaMenu();
				break;
					
			}
		}
	
	
	
	private static void cikis() {
			System.out.println("======> Cikis Basarili <======");
			
		}



	private static void ogretmenIslemleri() {
			// TODO Auto-generated method stub
			
		}



	private static void ogrenciIslemleri() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("============= \nOGRENCI ISLEMLERI\n=============\n1-EKLEME"
					+ "\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU\nQ-CIKIS");
		
	System.out.println("Yapmak istediginiz islemi giriniz");
	char secim = scan.next().toUpperCase().charAt(0);
	
	switch (secim) {
	case'1':
		Ogrenci.ekle();
		break;
	}
	}



	public static void main(String[] args) {
		
		

	}

}
