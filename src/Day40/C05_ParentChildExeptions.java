package Day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExeptions {

	public static void main(String[] args) throws IOException {
		// 
		
		
		try {
			FileInputStream fis = new FileInputStream("src\\Day40\\yazi.txt");
			boolean k=true;
			while(k=fis.read()!=-1){

				//System.out.println((char)k);
				
			}
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		System.out.println("gorev tamamlandi");
		}
	}


