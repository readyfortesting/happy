package Java_Practise_20Dec;

import java.util.Arrays;
import java.util.HashSet;

public class Ex08 {

	
	 public static void main(String[] args) {
	        // Soru 1 : bir metod oluþturup bir HashSet i
	        // verilen bu numaralar ile doldurunuz [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
	        // bu iþlemi generateSet() metodunda yapýnýz.mainden yazdýrýnýz.

	        HashSet<Integer> hs=generateSet();
	        System.out.println("hs = " + hs); //hs = [1, 2, 3, 4, 5, 6, 7, 8]

	        // AddElements þeklinde bir metodla 1 veya 1 den fazla sayý eklenebilen metodu
	        // yazýnýz.
	        AddElements(hs, 12,14);
	        AddElements(hs, 1,2,3,4,5,101,102,103);
	        AddElements(hs, 65);

	        System.out.println("hs = " + hs);
	    }

	    // Dizi tipindeki dizi, arraylist, set ler i fonktsiyona gönderdiðinizde
	    // fonksiyona kendisi gittiði için yapýlan deðiþiklikler kendisinde yapýldýðý için
	    // bu deðiþkenleri RETURN etmenize gerek yoktur.
	    public static void AddElements(HashSet<Integer> hs, Integer... sayilar)
	    {
	        //1.Yöntem
	        hs.addAll(Arrays.asList(sayilar));

	        //2.Yöntem
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
