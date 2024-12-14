/*Assignment - 87 : 30th July'2024
print a method to find whether given Strings are anagram.
write solution one with sorting another without sorting.

input : listen, silent
output : Anagram

input : techno, echtoo
output : Not an angram*/

package Anagram;

import java.util.Arrays;

public class AnagramString {
	
	boolean printAnagramString(String str1, String str2) {
		
		if(str1.length()==str2.length()) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
		
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
			return Arrays.equals(ch1, ch2);
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		AnagramString anagramString = new AnagramString();
		//anagramString.getAnagram("listen", "silent");
		anagramString.printAnagramString("techno", "ectnoo");
		
		boolean flag = anagramString.printAnagramString("naman", "manan");
		if(flag) {
			System.out.println("Both strings are Anagram");
		}
		else {
			System.out.println("Both strings are not Anagram");
		}
	}
}
/*boolean getAnagram(String str1, String str2) {
		
		if(str1.length()!= str2.length()) {
			System.out.println("string are not Anagram");
			return false;
		}
	
		while(str1.length()>0) {
			char ch =str1.charAt(0);
		
			str1 = str1.replace(String.valueOf(ch),"");
			str2 = str2.replace(String.valueOf(ch),"");
		
		if(str1.length()!= str2.length()) {
			System.out.println("Strings are not Anagram");
			return false;
			}
		}
		System.out.println("String are Anagram");
		return true;
	}*/


