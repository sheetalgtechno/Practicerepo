/*Program - 5 : 

Print only unique vowels using collections framework:
input: technocredits
output: oi*/

package August11;

public class UniqueVowel {
	
	void getVowel(String input) {
		//String output = "";
		for(int index=0;index<input.length();index++) {
			int count=0;
			char ch = input.charAt(index);
			for(int inIndex=0;inIndex<input.length();inIndex++) {
				char ch1 = input.charAt(inIndex);
				if(ch==ch1) {
					count++;
				}
			}
			if(count==1 && input.indexOf(ch)==index) {
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
				System.out.print(ch);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		UniqueVowel uniqueVowel = new UniqueVowel();
	//	uniqueVowel.getVowel(input);
	}
	

}
