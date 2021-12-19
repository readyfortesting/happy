package Day37_Inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	public static void main(String[] args) {
	
		
		
		Corolla		 arb1	=	new 	Corolla();
   //Class ismi &
		
		
		/*Java'da obje olusturdugumuz her class ismi ayný zamanda bir data turudur.
		 * Bu ornek icin Corolla hem class adi hem de arb1 objesinin data type'dir.
		 * 
		 * Java'da oble uretilen herbir class ayný zamanda non-primitive data turu olur.
		 * 
		 */
		System.out.println(arb1.calisiyorMu);// true // once toyata classýna orda yok,Araba classina gired True deger vardi.
		
		System.out.println(arb1.tekerSayisi);//4
		System.out.println(arb1.uretimYeri);//Turkiye
		
		Toyota arb2 = new Corolla();
		
		System.out.println(arb2.calisiyorMu);//true
		System.out.println(arb2.tekerSayisi); //4
		
		
		Araba arb3= new Corolla();
		System.out.println(arb3.calisiyorMu);
		
		
	
	
		
		

	}

}
