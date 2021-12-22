package Day38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();// tum hayvanlar beslenir
		kms1.hareket(); // kumes hayvanlari yuruyerek hareket eder
		kms1.solunum(); // kuslar akcigerleriyle nefes alir
		
		Kuslar kms2=new KumesHayvanlari();
		kms2.beslenme();//  tum hayvanlar beslenir
		kms2.hareket();// kumes hayvanlari yuruyerek hareket eder !!(SURPRİZ!!!)))
		kms2.solunum();//kuslar akcigerleriyle nefes alir
			
		Kuslar kms3=new Kuslar();
		kms3.beslenme(); // tum hayvanlar beslenir
		kms3.hareket(); // kuslar ucarak hareket eder
		kms3.solunum();	// kuslar akcigerleriyle nefes alir
		
		Animals kms4=new KumesHayvanlari();
		kms4.beslenme();//animals'dan alirim dedi // tum hayvanlar beslenir
		kms4.hareket(); //animals'dan alirim dedi // kumes hayvanlari yuruyerek hareket eder(Constructor kumes hayvani overridding var)
		kms4.solunum(); //animals'dan alirim dedi // kuslar akcigerleriyle nefes alir
		
	}
	 public void hareket() {
		 System.out.println("kumes hayvanlari yuruyerek hareket eder");
	
	 }

}
