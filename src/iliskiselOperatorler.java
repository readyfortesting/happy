
public class iliskiselOperatorler {

	public static void main(String[] args) {
		/*
		 * Operat�r	A��klama 
			==		E�it mi?
			!=		E�it-de�il mi?
			>		B�y�k m�?
			<		K���k m�?
			>=		B�y�k veya E�it mi?
			<=		K���k veya E�it mi?
		 */
		int sayi1=100;
		int sayi2=90;
		
		//sayi1> sayi2= boolean primitive data type (true-false dondurur.)
		System.out.println(sayi1 == sayi2); // E�it mi? : false
		
		System.out.println(sayi1 != sayi2); // E�it-de�il mi? : true
		
		System.out.println(sayi1 > sayi2); // B�y�k m�?  : true
		
		System.out.println(sayi1 < sayi2); // K���k m�? : false
		
		System.out.println(sayi1 >= sayi2); // B�y�k veya E�it mi? : true
		
		System.out.println(sayi1 <= sayi2); // K���k veya E�it mi? : false
	}

}
