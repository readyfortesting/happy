
public class iliskiselOperatorler_2 {

	public static void main(String[] args) {
		/*Write the condition of the numbers 25 and 30 to be equal to each other, 
		 * to be less than or greater, to the console with the 
		 * "relational operators" statement.
		 * 
		 */

		int sayi1 = 25;
		int sayi2 = 30;
		
		boolean esitMi = sayi1 == sayi2;
			
		System.out.println(sayi1 + "=" + sayi2 + " : " + esitMi); // 25=30 : false

		boolean buyukMu = sayi1 > sayi2;
		System.out.println(sayi1 + " > " + sayi2 + " : " + buyukMu); // 25 > 30 : false
		
		boolean kucukMu = sayi1 < sayi2 ;
		System.out.println(sayi1 + " < " + sayi2 + " : " + kucukMu); // 25 < 30 : true
		
		boolean kucukEsitMi= sayi1 <= sayi2;
		System.out.println(sayi1 + " <= " + sayi2 + " : " + kucukEsitMi); // 25 <= 30 : true
		
		boolean buyukEsitMi = sayi1 >= sayi2 ;
		System.out.println(sayi1 + " >= " + sayi2 +  " : " + buyukEsitMi); // 25 >= 30 : false
		
		
		
		

		
		
		
		
		
	}

}
