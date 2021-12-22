package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java'da bir dosya'ya ulasmak istedigimizde FileInputStream class'indan yardim aliriz.
		
		FileInputStream fis = new FileInputStream("src\\Day40\\yazi.txt");
		
		/*Java bu kodda olasi bir problem ongoruyor ve bu probleme karsi ne yapmasi gerektigini bize souyor
		 * Yani alti cizilen her kod CTE degildir. 
		 * 
		 * Bunun icin 2 durum sozkonusu
		 * 1: try catch kullanarak bu problemi handle edip Java!nin yoluna devam etmesini saglayabiliriz.
		 * 2: Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu ve sorumlulugun bizde oldugunu Java'ya soylemeliyiz.
		 */
		System.out.println("Gorev tamamlandi");
	}
	

}
