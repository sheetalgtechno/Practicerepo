/*Assignment - 62 : 11th July'2024

Find the vowel having max frequency.

input : Deharmadhikari : a -> 3
Entertainment : e -> 3
Persistent : e -> 2*/

package loop;

import java.util.Arrays;

public class VowelMaxFreq {
	
	public static void main(String[] args) {
		VowelMaxFreq vowelMaxFreq =new VowelMaxFreq();
		String Input = "Deharmadhikari";
		String Input1= "Entertainment";
		String Input2= "Persistent";
		System.out.print(Input +" : ");
		vowelMaxFreq.printVowelFreq(Input);
		System.out.print(Input1 +" : ");
		vowelMaxFreq.printVowelFreq(Input1);
		System.out.print(Input2 +" : ");
		vowelMaxFreq.printVowelFreq(Input2);
	}
	
	int getVowelFreq(String str,char ch) {
		int count=0;
		str=str.toLowerCase();
		for(int j=0;j<str.length();j++) {
			if(ch==str.charAt(j)) {
			count++;
			}
		}
	return count;
	}
	
	void printVowelFreq(String str) {
		int max=0;
		char maxChar=' ';
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);			
			if(i==str.indexOf(ch)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					int count=getVowelFreq(str,ch);
					if(count>max) {
						max=count;
						maxChar = ch;
					}					
				}				
			}
		}
		if(max>0) {
			System.out.println(maxChar + ":-"+ max);
		}
	}
}