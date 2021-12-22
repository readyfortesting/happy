package Day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HasSet {

	public static void main(String[] args) {
		// Verilen bir Array'deki tekrar eden 
		//sayilari silip unique degerlerden olusan bir array olusturun

		int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,6,7};
		
		// array'deki her elemani alip set'e atmak istiyorum
		/*for each ile atabilirim
		 * 
		 */
		Set<Integer> benzersizSet = new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
		System.out.println(benzersizSet); //[1, 2, 3, 4, 5, 6, 7, 8]
			
		/* Array'e cevirmek icin
		 */
		Object[] tekrarsizArr =benzersizSet.toArray(); // Object yap diye uyari verdi (sET'Ý ARRAY'a cevirdik,to Array methodu ile)
		System.out.println(Arrays.toString(tekrarsizArr)); // [1, 2, 3, 4, 5, 6, 7, 8] ARRAY OLDU
		
	}

}
