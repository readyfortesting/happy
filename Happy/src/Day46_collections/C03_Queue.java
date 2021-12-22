package Day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {
		
		Queue <String> kuyruk = new LinkedList<>(); 
		// QUEUE nin ozelligi: Gelen SONA gelir,silinen �LK BASTAN S�L�N�R
		//**** FIRST IN FIRST OUT****/////
		
		// sadece queue metodlarini kullanmak
		// istedigimiz icin data turunu QUEUE sectik
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("R�dvan");
		System.out.println(kuyruk); // [Lutfullah, Mustafa, R�dvan]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [Mustafa, R�dvan] ilk elementi S�LD�
		
		kuyruk.remove();
		System.out.println(kuyruk); // [R�dvan] "SON GELEN SONUNA KADAR BEKLER"
		
		kuyruk.add("R�dvan");
		System.out.println(kuyruk);// [R�dvan, R�dvan]
		
	}

}
