package Day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_deque {

	public static void main(String[] args) {
		// 

		Deque<String> ciftBasli = new LinkedList<>();
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli); // [Yildiz, Ali]
		/* [Yildiz, Ali] add() Queue'den gelidignden SONA ekler
		 * 
		 */
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli); // [Yildiz, Ali, Emine] bu da SONA ekler
		// aradaki fark HIZ olabilir.
		
		
		System.out.println(ciftBasli.pop()); // Yildiz
		// ÝLK ELEMENTÝ SÝLER
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli);// [Seyfullah, Ali, Emine]
		// Seyfullah'i ilk elemente EKLEDÝ
		
		
		
		
		
	}

}
