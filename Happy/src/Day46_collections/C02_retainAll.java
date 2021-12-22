package Day46_collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_retainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> lhs1=new LinkedHashSet<>();
		
		lhs1.add("Ali");
		lhs1.add("Mehmet ali");
		lhs1.add("Hasan");
		lhs1.add("Kutlu");
		
				
		Set<String> lhs2=new LinkedHashSet<>();
		lhs2.add("Ali");
		lhs2.add("Mehmet Ali");
		lhs2.add("Filiz");
		
		/*System.out.println(lhs1.retainAll(lhs2));//true
		System.out.println(lhs1); // []
		System.out.println(lhs2); // [Ali, Mehmet Ali, Filiz]
		*/
		System.out.println(lhs2.retainAll(lhs1));//true
		System.out.println(lhs1); // [ali, mehmet ali, Hasan, Kutlu]
		System.out.println(lhs2);
	}

}
