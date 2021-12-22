package Day47_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		// bir map olusturmadan Map'e koyacagimiz key ve value degerlerini
		// incelemeliyiz. Tum degerleri koyabilmek icin Key-Value icin Object,Object secebiliriz.
		/*Ama bu durumda map icerisindeki elemanlara ait bilgilere ulasmakta zorlanabiliriz
		 * Data turunu secerken hem icine koyacagimiz tum elemanlari kapsayacak bir data turu secmeliyiz
		 * hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit data turu secmeliyiz
		 * 
		 * 2- Map'i olustururken map'in turune de karar vermeliyiz.
		 * 
		 * 
		 */
		Map <Integer , String> sinif = new HashMap<>();
		sinif.put(101, "Ali , Can , Java.dev ");
		sinif.put(102, "Veli , Yan , QA");
		sinif.put(103, "Ali , Yan , C#");
		
		int      no   = 104;
		String   isim = "Ayse";
		String   soyisim ="Can";
		String   brans = "QA";
		
	sinif.put(no, isim+","+soyisim+","+brans);
	System.out.println(sinif);
	//{ 101= Ali , Can , Java.dev , 102=Veli , Yan , QA, 103=Ali , Yan , C#, 104=Ayse,Can,QA}
	// Key1- Value1                 Key2- Value2         Key3- Value3 

	
	// No'su 102 olan ogrencinin bilgilerini gorelim
	System.out.println(sinif.get(102)); // Veli , Yan , QA
	System.out.println(sinif.get(104)); // Ayse,Can,QA
	
	
	/* Map'deki tum key'leri gorelim dersek
	 * sinif.keySet(); ve syso ile yazdiririz.
	 */
	sinif.keySet();
	System.out.println(sinif.keySet()); // [101, 102, 103, 104]
	// bir Set olarak Key degerlerini yazdirir.
	
	
	/* MAP'deki tum VALUE'lari gormek istersek
	 * sinif.values();
	 */
	System.out.println(sinif.values());
	// [Ali , Can , Java.dev , Veli , Yan , QA, Ali , Yan , C#, Ayse,Can,QA]
	
	
	
	// SINIFTAKÝ OGRENCÝLERÝN ÝSÝMLERÝNÝ BÝR LÝSTEYE EKLEYÝP YAZDÝRALÝM
	
	List<String> valueList = new ArrayList<>((sinif.values()));
	System.out.println(valueList); // [Ali , Can , Java.dev , Veli , Yan , QA, Ali , Yan , C#, Ayse,Can,QA]
	
	System.out.println(valueList.size()); // 4
	
	List<String> isimListesi = new ArrayList<>();	
	String bilgiler[] =new String[3];
	
	for (int i = 0; i < valueList.size(); i++) {
		bilgiler=valueList.get(i).split(",");
		isimListesi.add(bilgiler[0]);
		
	}
	System.out.println(isimListesi);// [Ali , Veli , Ali , Ayse]
	}

}
