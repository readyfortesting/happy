package Java_Practise_20Dec;

import java.util.Arrays;
import java.util.HashSet;

public class Ex08 {

	
	 public static void main(String[] args) {
	        // Soru 1 : bir metod olu�turup bir HashSet i
	        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
	        // bu i�lemi generateSet() metodunda yap�n�z.mainden yazd�r�n�z.

	        HashSet<Integer> hs=generateSet();
	        System.out.println("hs = " + hs); //hs = [1, 2, 3, 4, 5, 6, 7, 8]

	        // AddElements �eklinde bir metodla 1 veya 1 den fazla say� eklenebilen metodu
	        // yaz�n�z.
	        AddElements(hs, 12,14);
	        AddElements(hs, 1,2,3,4,5,101,102,103);
	        AddElements(hs, 65);

	        System.out.println("hs = " + hs);
	    }

	    // Dizi tipindeki dizi, arraylist, set ler i fonktsiyona g�nderdi�inizde
	    // fonksiyona kendisi gitti�i i�in yap�lan de�i�iklikler kendisinde yap�ld��� i�in
	    // bu de�i�kenleri RETURN etmenize gerek yoktur.
	    public static void AddElements(HashSet<Integer> hs, Integer... sayilar)
	    {
	        //1.Y�ntem
	        hs.addAll(Arrays.asList(sayilar));

	        //2.Y�ntem
	        for(int i=0;i< sayilar.length;i++)
	            hs.add(sayilar[i]);
	    }

	    public static HashSet<Integer> generateSet()
	    {
	        Integer[] dizi={1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
	        HashSet<Integer> hs=new HashSet<>(Arrays.asList(dizi));
	        return hs;
	    }
}
