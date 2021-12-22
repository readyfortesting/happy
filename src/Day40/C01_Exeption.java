package Day40;

public class C01_Exeption {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		

		
			try {
				System.out.println("sayilarin bolumu :" + a/b);
			}catch(ArithmeticException e) {
				System.out.println("sifira bolum yapilamaz");
				
			}
			System.out.println("Gorev tamamlandi");
	}

}
