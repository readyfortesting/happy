package KÝTAP_YONETIMI_PROJECT;

public class Kitap {
	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		this.no=no;
		this.kitapAdi=kitapAdi;
		this.yazarAdi=yazarAdi;
		this.yayinYili=yayinYili;
		this.fiyat=fiyat;
		}
	public Kitap() {
		
	}
	
		
		
		// Bu claas'ta sadece objelerin ozellikleri olacak,birsey calistirmayacak
		//field'larini girelim
	
	public int getNo() {
		
		return no;
	}
	public void setNo(int no) {
		
		this.no = no;
	}
	
	public String getKitapAdi() {
		
		return kitapAdi;
	}
	
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	
	public String getYazarAdi() {
		return yazarAdi;
	}
	
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
		
	}
	
	public int getYayinYili() {
		
		return yayinYili;
	}
	
	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
		
	}
	
	public double getFiyat() {
		
		return fiyat;
		
	}
	
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
		
	}
	
	// 4- getter-setter'dan sonra CONSTRUCTOR olusturduk
	// 5- Constructor olusturduktan sonra bir tane de PARAMETRESÝZ DEFAULT CONSTRUCTOR olusturmamiz lazim.
	

		
	
	//19.adim // girdiginiz variable'lari  String'e cevirir ve yazdirir to String methodu
	@Override
							public String toString() {
		return 					"Kitap [no=" + no + ", "
								+ "kitapAdi=" + kitapAdi + ", "
								+ "yazarAdi=" + yazarAdi + ","
								+ " yayinYili=" + yayinYili
								+ ", fiyat=" + fiyat + "]";
	}
		
		//yukaridaki field'lari koruma altina almak icin(ENCAPSULATION) private yapariz
	// private yapinca mecburen GETTER-SETTER yapilmali.(source-generate getters setters)
	

	}


