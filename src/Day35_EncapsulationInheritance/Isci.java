package Day35_EncapsulationInheritance;

public class Isci extends Muhasebe {

	protected   String statu;
	protected	String meslegi;
	protected	String Sendika;
	
	public Isci(){
		System.out.println("Isci parametresiz constroctor calisti");
	}
	
	/* eger variable'lara access modifier yazmazsak Java access modifier olarak default acc.mod atar.
	 * boytle olursa sadece o package altindaki 
	 * child class'lar personel class'ini inherit edebilir.
	 * Baska package'lardaki child class'larin da personel'i inherit edebilmesi icin
	 * variable ve method'larin acc. mod.'larini protected yapariz.
	 * Public yapsak da 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		Isci isci1=new Isci();
		
		isci1.meslegi="Kaynakci";
		isci1.saatUcreti=20;
		isci1.isim="Emine";
		isci1.maas=isci1.maasHesapla();
		System.out.println(isci1.isim+" in maasi :" + isci1.maas); // Emine in maasi :4000
		
		

	}

}
