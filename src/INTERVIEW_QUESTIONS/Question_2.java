package INTERVIEW_QUESTIONS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams
​
		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,   aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..
​
		 */

	Scanner scan = new Scanner (System.in);
	System.out.println("Please type two words to see if it is an Anagram or not");
	String str1=scan.next().toLowerCase();
	String str2=scan.next().toLowerCase();
	
	List <String> str11= new ArrayList<>();
	List <String> str22= new ArrayList<>();
	
	for (int i = 0; i < str1.length(); i++) {
		str11.add(str1.substring(i, i+1));
	
	}
	if (str11.size()==str22.size()) {
		if(str11.containsAll(str22)==true) {
			System.out.println("The words \"" + str1 + "\" and \""+ str2 + "\"  you typed are Anagrams");
			
		}else {
			System.out.println("\"The words \\\"\" + str1 + \"\\\" and \\\"\" + str2 + \"\\\" you typed are not Anagrams\");");
		}
		}else {
			System.out.println("The words \"" + str1 + "\" and \"" + str2 + "\" you typed are not Anagrams");
			
		}
		
	}
}
	

	
	

