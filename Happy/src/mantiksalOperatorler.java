
public class mantiksalOperatorler {

	public static void main(String[] args) {
		
		/*    && => AND operatörü
		 
		 * Bütün koşulların doğru olduğu durumda true , 
		 * en az birinin sağlanmaması durumunda false olarak geri döner. Ve anlamı katar.
		 
		 
              || => OR  operatörü
              
              Koşullardan en az bir tanesinin doğru olması durumunda true olarak döner.
               Hepsinin yanlış olması durumunda false olarak döner. Veya anlamı katar.
                                    
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
