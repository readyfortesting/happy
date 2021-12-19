package Day39_overriding;

public class C01 {

	public static void main(String[] args) {
		System.out.println("Parent class static method calisti");
				
	}
	protected void privateMethod() {
		System.out.println("Parent class private method");
	}
/*final demek bu son hali bir daha degistirilemez demektir
 * dolayisiyla final olarak tanimlanan bir method
 * OVERRIDE EDÝLEMEZ!!
 */
	public final void finalMethod() {
		System.out.println("Parent class final method");
	}
	/*child class ile parent class ayni package'da olduklarindan
	 * method'larin access modifier'lari public,protected veya default olsaydi
	 * hicbir sorun olmazdi
	 */
}
