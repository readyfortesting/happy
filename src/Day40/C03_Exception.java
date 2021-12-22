package Day40;

import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		// Verilen bir  int array icin kullanicidan sayi isteyin ve girilen sayiyi
		// index olarak kabul edip o indexteki elementi yazdirin.
		
			int arr[]= {2,3,5,6,2,7,9,1};
			
			Scanner scan = new Scanner (System.in);
			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index=scan.nextInt();
			System.out.println("girdiginiz indexteki element :" + arr[index]);
			

	}

}
