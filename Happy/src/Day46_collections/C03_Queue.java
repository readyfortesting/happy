package Day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		Queue <String> kuyruk = new LinkedList<>(); 
		// QUEUE nin ozelligi: Gelen SONA gelir,silinen ÝLK BASTAN SÝLÝNÝR
		//**** FIRST IN FIRST OUT****/////
		
		// sadece queue metodlarini kullanmak
		// istedigimiz icin data turunu QUEUE sectik
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Rýdvan");
		System.out.println(kuyruk); // [Lutfullah, Mustafa, Rýdvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Mustafa, Rýdvan] ilk elementi SÝLDÝ
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Rýdvan] "SON GELEN SONUNA KADAR BEKLER"
		
		kuyruk.add("Rýdvan");
		System.out.println(kuyruk);// [Rýdvan, Rýdvan]
		
	}

}
