
public class mantiksalOperatorler {

	public static void main(String[] args) {
		
		/*    && => AND operat�r�
		 
		 * B�t�n ko�ullar�n do�ru oldu�u durumda true , 
		 * en az birinin sa�lanmamas� durumunda false olarak geri d�ner. Ve anlam� katar.
		 
		 
              || => OR  operat�r�
              
              Ko�ullardan en az bir tanesinin do�ru olmas� durumunda true olarak d�ner.
               Hepsinin yanl�� olmas� durumunda false olarak d�ner. Veya anlam� katar.
                                    
	 		 */
			//birden fazla kosul olunca mantiksal operator kullanilir.
		// mesela askerelik icin 20 yasinda olmali ve erkek olmali gibi.
		
			int sayi1 = 75 ;
			
			//       true          true   // tum kosullar TRUE olmali.
			// sayi1 > 50 && sayi1 < 100;
		System.out.println(sayi1> 50 && sayi1 < 100); // true

	  int sayi2 = 20;
	  //   true         false
	  // sayi2>10 || sayi2 <5
	  
	  System.out.println(sayi2 > 10 || sayi2 < 5); // true (Herhangi biri TRUE ise TRUE yazdirir)
	  
	  
		
	}

}
