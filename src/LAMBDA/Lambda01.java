package LAMBDA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

	
	/*//NE OLACAGI KONUSUNA CEVAP VER�R**
	   1) Lambda "Functional Programming"
	      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" �zerine �al���r,dusunulur.
	   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	   ve hatasiz code yazma acilarindan cok faydalidir.
	   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ****** ancak map'lerde kullan�lmaz. ****
	      Lambda kullanmak hatas�z code kullanmakt�r.
	      
	   *   Kodun hizli olmasi icin
	   *   Kodun okunabilir olmasi icin
	   *   Kodum hafizada daha az yer turmasi icin,RAM'den daha az yemesi icin
	   *   REUSABLE olmasi : tekrarli kullanima izin verir
	*/
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,65,42,55));
		
		printElStructured(list); // METHOD CALL
		System.out.println();
		System.out.println("printElStructured : Task 1 =============");
		
		printElfuntctional(list);
		System.out.println();
		System.out.println("printElfuntctional : Task 2 ==================");
		
		printElfunctional1(list); // method reference calisti
		System.out.println();
		System.out.println("printElfuntctional1 ===============");
		
		
		printCiftElStructured(list);
		System.out.println();
		System.out.println("printCiftElStructured : ==========");
		
		printCiftElfunctional1(list);
		System.out.println();
		System.out.println("===============================");
		
		printCiftElFunctional12(list);
		System.out.println();
		System.out.println("printCiftElFunctional12 : ");
		
		 printCiftAltm�sKucuk(list);
	        System.out.println();
	        System.out.println("   ***   ");
		
		tekYirmidenBuyukPrint(list);
		System.out.println();
		System.out.println("==CiftKareprint : =============");
		
		ciftKarePrint(list);
		System.out.println();
		System.out.println("kupBirFazlaFunction : ==================");
		
		kupBirFazlaTekFunction(list);
		System.out.println();
		System.out.println("karekokCiftfunctional : =============");
		
		karekokCiftfunctional(list);
		System.out.println();
		System.out.println("karekokCiftfunctional : ===========");
		
		maxElemanfunctional(list);
		System.out.println();
		System.out.println("maxElemanfunctional : ===========");
		
		
	}
			private static void tekYirmidenBuyukPrint(List<Integer> list) {
		// TODO Auto-generated method stub
		
	}
			private static void printCiftElfunctional1(List<Integer> list) {
		
		
	}
			//*** TASK 1: Structured programming ile List elemanlarinin tamaminini aralarina bosluk birakarak yazdiriniz.
	public static void printElStructured(List<Integer>list) { // PARAMETR�S�N� DE G�RMEM�Z LAZ�M
		
		for (Integer w : list) {
			System.out.print(w+" "); // w for each variable'i demek , t : Lambda variable'i demektir JAVA CONVENTIAL
		}
		
		
	}
	
	//***  TASK 2: Functional programming ile List elemanlarinin tamaminini aralarina bosluk birakarak yazdiriniz.
	
		public static void printElfuntctional(List<Integer>list) {
			list.stream().
			forEach(t->
			System.out.print(t + " ")); // Lambda expression
			
			// ey list stream ol her birini yazdir dedik
			
			/*stream()
			 *Datalari yukaridan a�a��ya ak�� �ekline getirir.Dikey hale getirir,yukaridan a�a��ya �elale gibi.
			 *Stream'de yataydan daha fazla method calistirir.
			 *
			 * forEach(): Data'nin parametresine g�re her bir eleman� i�ler.
			 * 
			 * t-> lambda operatoru demek
			 * 
			 * Lambda Expression yapisi cok tavsiye edilmez,daha �ok METHOD REFERENCE kullanilir
			 */
			
			
		}
		/* Method Reference : Kendi create ettigimiz veya Java'dan aldigimiz method ile
		 * ClassName:: MethodName // EZBERLE ******!!!
		 */
		
		// METHOD OLUSTURALIM,GEREKT���NDE CAG�R�P KULLANAB�L�R�Z
		public static void printEl(int t) { // refere edilecek method olusturduk
			System.out.print(t + " ");
			
			
		}
		public static void printElfunctional1(List<Integer> list) {
			
		list.
		stream().
		forEach(Lambda01::printEl);
		
		// Once  stream dikey yapar
		// Sonra for each
		// Lambda01::printEl (Lambda 01 classindaki printEl methoduna gidiyoruz)
		
			
		}
		// TASK 3: Structured programming ile list elemanlarinin cift olanlarini
		// ayni satirda aralarina bosluk birakarak yazdiriniz.
		
		public static void printCiftElStructured(List<Integer> list) { // cift elemanlarini yazdiran bir method olusturduk
			// bir listin cift sayilarini yazdirmak icin
			for(Integer w : list) { // adin w olsun, degerlerini list'ten alacaksin
				if(w %2==0) {
					System.out.print(w+" ");// adigimiz w 'ler 2'ye bolununce sifir kaliyorsa C�FT sayi demektir
					
				} 
			}
			
			
		}
		
		// TASK 4: Functional programming ile list elemanlarinin cift olanlarini
				// ayni satirda aralarina bosluk birakarak yazdiriniz.
		
		public static void printCiftElFunctional1(List<Integer> list) {
			list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);
			
		}
		
		public static void printCiftElFunctional12(List<Integer> list) {
			 list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
		}
		public static void printCiftAltm�sKucuk(List<Integer> list) {
	        list.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambda01::printEl);
			
		}
		       
      public static boolean ciftBul(int i) { // refere edilecek tohum method yaptik
			
			return i%2==0;
		}
      //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
      // olanlar�n� ayni satirda aralarina bosluk birakarak yazdiriniz
      public static void tekYirmidenbuyukPrint(List<Integer> list) {
          list.stream().filter(t ->t%2 == 1 ||t>20).forEach(Lambda01::printEl);
          
		}
		/*
		 * //Functional Programming ile list elemanlarinin  cift olanlarinin
// karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
		 */
		public static void ciftKarePrint(List<Integer>list) {
			list.stream().
			filter(Lambda01::ciftBul).
			map(t->t*t).forEach(Lambda01::printEl);
			
			
}
		
		/*
		 * SORU: fUNCT�ONAL PROGGRAMM�NG �LE L�ST ELEMANLAR�N�N TEK OLANLAR�N�N KUPLER�N�N B�R FAZLAS�N�
		 * AYN� SAT�RDA ARALAR�NA BOSLUK B�RAKARAK YAZD�R�N�Z.
		 * 
		 */
		public static void kupBirFazlaTekFunction(List<Integer>list) {
			
			list.stream().
			filter(t->t%2==1).
			map(t->(t*t*t)+1).
			forEach(Lambda01::printEl);
			
		}
		/* fUNCT�ONAL PROGGRAMM�NG �LE L�ST ELEMANLAR�N�N C�FT OLANLAR�N�N
		 *  KAREK�KLER�N� AYNI SAT�RDA ARALAR�NA BOSLUK B�RAKARAK YAZD�R�N�Z.
		 */
		public static void karekokCiftfunctional(List<Integer>list) {
			list.stream().
			filter(Lambda01::ciftBul).
			map(Math::sqrt).
			forEach(t->System.out.println(t+" "));
			
		}
		
		/*TASK : 
		 * List'in en buyuk elemanini yazdiriniz.
		 */
		public static void maxElemanfunctional(List<Integer> list) {
				Optional<Integer>maxEl= list.
				stream().reduce(Math::max);
				System.out.println(maxEl);
				
			//reduce() : en buyuk elemana cevir demek.Bircok datayi tek bir dataya cevirmek icin kullanilir.
				// maximum, minimum gibi, listin icindeki sayilarin toplami gibi,en b�y�k �ss� gibi,
				//�oklu malzemeyi tek dataya d���rmek i�in...
				
			// Optional : bir class't�r. 
			/* deger alabilen , almayan,
			 * exeption gibi calisir
			 * 
			 */
		}
}
