package K�TAP_YONETIMI_PROJECT;

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
	1.	Kullan�c�n�n Kitap ekleme, silme ve listeleme gibi
		i�lemleri yapmas�na imkan tan�yan bir uygulama yaz�n�z.
	2.	Program, kitaplara 1001�den ba�layarak s�ral� ve otomatik numara vermeli.
		Bunun yan�nda, her bir kitap i�in Kitap Ad�, Yazar Ad�, Yay�n Y�l� ve Fiyat gibi bilgiler girilebilmelidir.
	3.	Program�n ba�lang�c�nda Kullan�c�ya a�a��daki gibi bir men� sunulmal�d�r.
		Kullan�c� program� bitirene kadar i�lemlere devam edebilmelidir.
		
		========= K�TAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: T�m kitaplar� listele
			4: Bitir
 */
	
	
		
		
	
		
		
		

	
			
	private void kitaplarEkle(List<Kitap> kitapListe2) {
			// TODO Auto-generated method stub
			
		}

	//9
	public static void menu(List<Kitap> liste) {
	//10
	System.out.println("========= K�TAP PROGRAMI =============\n1: Kitap ekle\n2: Numare ile kitap sil\n3: " +
	"Tum kitaplari listele\n4: Bitir");	
	//11 Tercih isteriz
	System.out.println("�sleminizi seciniz");
	
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
