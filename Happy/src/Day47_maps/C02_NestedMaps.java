package Day47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
		
		/* ic ice MAP olusturacaksak en icerdekinden baslamaniz tevsiye edilir.
		 */
			Map<String , String> ogr1Map = new HashMap<>();
				
				ogr1Map.put("isim", "Ali");
				ogr1Map.put("soyisim", "Can");
				ogr1Map.put("Brans", "J.dev");
				
			Map<String , String> ogr2Map = new HashMap<>();
				ogr2Map.put("isim", "Veli");
				ogr2Map.put("soyisim", "Yan");
				ogr2Map.put("Brans", "QA");
				
			Map<String , String> ogr3Map = new HashMap<>();
				ogr3Map.put("isim", "Ali");
				ogr3Map.put("soyisim", "Yan");
				ogr3Map.put("Brans", "C#");
				
			Map<String , String> ogr4Map = new HashMap<>();
			  ogr4Map.put("isim", "Ayse");
			  ogr4Map.put("soyisim", "Can");
			  ogr4Map.put("Brans", "QA");
				
			  System.out.println("1. ogrenci : " + ogr1Map);
			  System.out.println("2. ogrenci : " + ogr2Map);
			  System.out.println("3. ogrenci : " + ogr3Map);
			  System.out.println("4. ogrenci : " + ogr4Map);
			  
			Map<Integer, Map <String , String>> sinifMap = new HashMap<>();
			  sinifMap.put(101, ogr1Map);
			  sinifMap.put(102, ogr2Map);
			  sinifMap.put(103, ogr3Map);
			  sinifMap.put(104, ogr4Map);
			  
			System.out.println(sinifMap);
			  
			  
	}

}
