package Day35_EncapsulationInheritance;

public class C01 {

	
	private double not=49.9;
	private boolean gecerMi=false;
	public double getNot() {
		return not;
	}
	public void setNot(double not) {
		this.not = not;
	}
	public boolean isGecerMi() {
		return gecerMi;
	}
	public void setGecerMi(boolean gecerMi) {
		this.gecerMi = gecerMi;
	}
	
	
}

// encapsulation : istedigimiz class uyelerinin degistirilmesi ve gorulmesini istedigimiz oranda
//encapsulation sadece private kullanir,setter'lara musaade eder.

// datalari nasil saklariz=? private yapariz
// private olursa kimse ulasamaz ? getter ve setter methodlarindan uygun olankllari kullanarak gorebili,riz
//getter : gormemize izin verir degistirmemize izin vermez
// setter: goremez ama degistirmemize izin verir

//immutable class nedir ? degismez demektir. tum class uyelerinin hepini sadece getter yaparsak immutable class olur.
// immutable's setter'la izin vermez.

// getter naming convention nedir ? booolean "is" ile baslar diherler get ile baslar.
