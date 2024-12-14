/*Assignment - 33 : 7th Dec [15 mins]
print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4*/
package Nov_String;

public class FreqUpperChar {
	
	void printFreqUpperChar(String str) {
	
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)&& i==str.indexOf(ch)) {
				int count=0;
			
				for(int j=0;j<str.length();j++) {
				
					if(str.charAt(j)==ch) {
						count++;
					}
				}
				System.out.println(ch + " -> " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		FreqUpperChar freqUpperChar =new FreqUpperChar();
		freqUpperChar.printFreqUpperChar("AABcBBBAdeddd");
	}

}
