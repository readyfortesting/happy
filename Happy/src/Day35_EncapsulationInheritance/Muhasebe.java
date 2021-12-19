package Day35_EncapsulationInheritance;

public class Muhasebe extends Personel  {
		
	protected int saatUcreti;
	protected	String statu;
	protected	int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constroctor calisti");
	}
	
	public static void main(String[] args) {
		
		//class'ýn kendisinden bir obje olusturalim
		Muhasebe clsn1=new Muhasebe();
		clsn1.isim="Ali";
		System.out.println(clsn1.soyisim); //null , cunku  soyisime birsey atamadik
		// personel classinda ne varsa muhasebe classindan extends yaparak gorebiliyoruz.
		
		
		
	}
	
	// method olusturalim
	public int maasHesapla() {
		
		int maas=8*25*saatUcreti;				
		
		return maas;
		
	}
	
	
}
