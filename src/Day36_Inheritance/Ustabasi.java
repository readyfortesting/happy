package Day36_Inheritance;

import Day35_EncapsulationInheritance.Isci;

public class Ustabasi  extends Isci {

	Ustabasi(){
		System.out.println("ustabasi parametresiz constroctor calisti");
		
	}
	
	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		/* Javada her class olusturuldugunda otomatik olarak default
		 * constructor olusturuldugu gibi, child class'da olusturulan herbir 
		 * constructor'in ilk sat�r�nda gizli super() constructor (default olarak) olusturur
		 * her constructorda super() koymaz
		 * eger child class'taysa jAVA OTOMAT�K OLARAK B�R super() EKLER.
		 * 
		 */
		

	}

}
