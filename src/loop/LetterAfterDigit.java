/*Assignment - 70 : 15th July'2024
return uniquely present first volwel letter followed by digit(s) from given string.

input : aakan1ksi44au3p
output : i*/

package loop;

public class LetterAfterDigit {
	
	void getLetterfollowedDigit(String str) {
			str = str.toLowerCase();
			
			for(int index=0;index<str.length();index++) {
				char ch = str.charAt(index);
				
				if(str.indexOf(ch)==str.lastIndexOf(ch) && Character.toString(ch).matches("[aeiou]")) {
					if(str.indexOf(ch)!=str.length()-1) {
						if(Character.isDigit(str.charAt(str.indexOf(ch)+1))) {
							str = Character.toString(ch);
						}
					}
				}
			}
			System.out.println("Output : " + str);
		}
	
		public static void main(String[] args) {
			LetterAfterDigit letterAfterDigit = new LetterAfterDigit();
			String str  = "aakan1ksi44au3p";
			System.out.println("Input : " + str);
			letterAfterDigit.getLetterfollowedDigit(str);
		}
	}

