package Day48_maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		/*VERÝLEN BÝR sTRÝNG'DEKÝ HARFLERÝ VE HARFLERÝN KACAR KEZ
		 * KULLANÝLDÝGÝNÝ RETURN EDEN BÝR METHOD YAZÝNÝZ.
		 * 
		 * Ornek : input  : hellooo
		 *         output : H=1, e=1, l=2, o=3
		 */
		
		String input = "Hellooo";
		harfSay(input);
		
		Map<String,Integer> mainMap=harfSay(input);
		System.out.println(mainMap);
		
	}

	private static Map<String, Integer> harfSay(String input) {
		
		Map<String,Integer> harfSayilariMap=new HashMap<>();
		
		
		// Hellooo ,harflere ayirmamiz lazim
		String inputArr[]=input.split(""); //[H, e, l, l, o, o, o]
		
		
		for (String each : inputArr) {
			if (!harfSayilariMap.containsKey(each)) {
				 harfSayilariMap.put(each, 1);
				
			}else {
				 //harfSayilariMap.get(each)+1; bu girilen harfin value'sini bulup bir artirir.
				 harfSayilariMap.put(each, harfSayilariMap.get(each)+1);
			}
		}
		
		return harfSayilariMap;
		
	}

}
