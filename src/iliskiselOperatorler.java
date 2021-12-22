
public class iliskiselOperatorler {

	public static void main(String[] args) {
		/*
		 * Operatör	Açýklama 
			==		Eþit mi?
			!=		Eþit-deðil mi?
			>		Büyük mü?
			<		Küçük mü?
			>=		Büyük veya Eþit mi?
			<=		Küçük veya Eþit mi?
		 */
		int sayi1=100;
		int sayi2=90;
		
		//sayi1> sayi2= boolean primitive data type (true-false dondurur.)
		System.out.println(sayi1 == sayi2); // Eþit mi? : false
		
		System.out.println(sayi1 != sayi2); // Eþit-deðil mi? : true
		
		System.out.println(sayi1 > sayi2); // Büyük mü?  : true
		
		System.out.println(sayi1 < sayi2); // Küçük mü? : false
		
		System.out.println(sayi1 >= sayi2); // Büyük veya Eþit mi? : true
		
		System.out.println(sayi1 <= sayi2); // Küçük veya Eþit mi? : false
	}

}
