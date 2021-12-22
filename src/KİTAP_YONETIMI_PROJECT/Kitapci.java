package KÝTAP_YONETIMI_PROJECT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapci {

	private static final Kitapci KitapMethod = null;
		//6-  
		 static List<Kitap> kitapListe= new ArrayList<>(); // static yaptiutun classlar ulassin,goktey gibi
		 
		 public static void main (String[] args) {
			 KitapMethod.kitaplarEkle(kitapListe);
			 KitapMethod.menu(kitapListe);
			 Scanner scan=new Scanner(System.in);
			 int kitapNo=1001;
		 }
		 //7 Kullanicidan bol bol girdi alacagimiz icin static Scanner
		
		 //8 
		 
		 
		 
			
	/*
	1.	Kullanýcýnýn Kitap ekleme, silme ve listeleme gibi
		iþlemleri yapmasýna imkan tanýyan bir uygulama yazýnýz.
	2.	Program, kitaplara 1001’den baþlayarak sýralý ve otomatik numara vermeli.
		Bunun yanýnda, her bir kitap için Kitap Adý, Yazar Adý, Yayýn Yýlý ve Fiyat gibi bilgiler girilebilmelidir.
	3.	Programýn baþlangýcýnda Kullanýcýya aþaðýdaki gibi bir menü sunulmalýdýr.
		Kullanýcý programý bitirene kadar iþlemlere devam edebilmelidir.
		
		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplarý listele
			4: Bitir
 */
	
	
		
		
	
		
		
		

	
			
	private void kitaplarEkle(List<Kitap> kitapListe2) {
			// TODO Auto-generated method stub
			
		}

	//9
	public static void menu(List<Kitap> liste) {
	//10
	System.out.println("========= KÝTAP PROGRAMI =============\n1: Kitap ekle\n2: Numare ile kitap sil\n3: " +
	"Tum kitaplari listele\n4: Bitir");	
	//11 Tercih isteriz
	System.out.println("Ýsleminizi seciniz");
	
	Scanner scan = null;
	//12
	int tercih=scan.nextInt();
	
	//13 
	switch(tercih) {
	
	//14
	case 1:
		kitapEkle(liste);
		break;
	
	case 2:
		noIleSil(liste);
		break;
		
	case 3:
		listele(liste);
		break;
	
	case 4:
		bitir();
		break;
		default:
			System.out.println("yanlis giris yapildi tekrar deneyiniz");
			break;
			
	}
	
	}
		private static void listele(List<Kitap> liste) {
			for(Kitap k: liste) {
				System.out.println(k.toString());
			}
			menu(liste);
		}
	private static void bitir() {
		// TODO Auto-generated method stub
		
	}
		//15
	private static void listele1(List<Kitap> liste) {
		System.out.println("yine bekleriz");
		
	}
		//21.adim
	private static void noIleSil(List<Kitap> liste) {
		System.out.println("silinecek kitap no giriniz");
		Scanner scan = null;
		int silinecekNo=scan.nextInt();
		
		
	}
		//16 * method create edecegiz
	private static void kitapEkle(List<Kitap> liste) {
		System.out.print("kitap ismi giriniz");
		Scanner scan = null;
		String kitapAdi=scan.nextLine();
		
		System.out.print("Yazarin adini giriniz");
		String yazarAdi=scan.nextLine();
		
		System.out.print("Yayin yilini giriniz");
		int yayinYili=scan.nextInt();
		
		System.out.print("Fiyatini giriniz");
		double fiyat=scan.nextDouble();
		
		int kitapNo = 0;
		//17
		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi, yayinYili,fiyat); // kitap objesi create edildi.
		//18 
		liste.add(kitap);
		System.out.println(kitap.toString()+"eklendi :) "); //20.adim syso icine to string methodu koyduk
		// to string methodu sadece objenin field'ini yazdirir.
		
		
	}
}
