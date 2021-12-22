package Day39_overriding;

public class C02 extends C01{

	public static void main(String[] args) {
		C02 obj1=new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
	}

	public static void staticMethod() {
		System.out.println("Child class static method calisti");
		
	}
	protected void privateMethod() {
		
	}
/*
 * public final void finalMethod(){
 
 } 
 */
	
}
