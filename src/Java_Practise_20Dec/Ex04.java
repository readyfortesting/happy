package Java_Practise_20Dec;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 		Node'larin de�ereleri; "Ali" "Veli" "Ayse" "Can" olan bir LinkedList olusturun
		 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
		    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
		 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
		 	
		 */

    LinkedList<String> ll = new LinkedList<>(Arrays.asList("Ali", "Veli", "Ayse", "Can"));

    Scanner scan = new Scanner(System.in);
    System.out.println("�sim giriniz :");
    String isim = scan.nextLine();

   
        if (ll.remove(isim)) {
           
            System.out.println("bu isim Linked da vard� ve silindi :" + ll);
            
        } else {

            System.out.println("Bu isim linked listte yoktu silinemedi :" + ll);
        }
    
}
}
