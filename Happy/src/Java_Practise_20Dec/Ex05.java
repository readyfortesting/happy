package Java_Practise_20Dec;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex05 {

	
	public static void main(String[] args) {
		// Verilen bir Array'deki tekrarli elemanlari silip
        // unique elemanlardan olusan bir Array'e ceviren 
        // bir method yaziniz

		int arr[] = {2,3,4,3,5,3,6,4,7,4,8,5};
		
		//Methodla 
		int tekrarsizArray [] = tekrarlariSil(arr);
		System.out.println("Main method icinde Array olarak : " +Arrays.toString(tekrarsizArray));
		//Main method icinde Array olarak : [2, 3, 4, 5, 6, 7, 8]
		}

	public static int[] tekrarlariSil(int[] arr) {
			
		Set<Integer> set1 = new HashSet<>();//Set Hashset'in parent'i oldu�u i�in HasHSet metodlar�n� kullanamaz ama daha h�zl� �al���r.
											// SEt interface old� i�in obj olu�turulamaz HashSet Class oldu�u i�in new ile obj olu�turduk.
		for (Integer each : arr) {
			set1.add(each);
			}	
		
		System.out.println(set1);  //[2, 3, 4, 5, 6, 7, 8]
		
		int tekrarsizArray []=new int[set1.size()];  //yukardaki tekrarsiz array den farkli!
		
		int index=0;
		for (int each : set1) {
			tekrarsizArray[index]=each;
			index++;
			
		}
		return tekrarsizArray;

		}
}
