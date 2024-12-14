/*Assignment - 69 : 15th July'2024

return uniquely present letters followed by digit(s) from given string.

input : aakan1ksh44a
output : nh*/

package loop;

public class PrintUniqueLetter {
	
	void getUniqueletter(String str) {
		String str2 = "";
		for(int index = 0 ; index<str.length();index++) {
			char ch  = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				if(str.indexOf(ch)!=str.length()-1) {
					if(!Character.isDigit(ch)) {
						if(Character.isDigit(str.charAt(str.indexOf(ch)+1)))
							str2 = str2.concat(String.valueOf(ch));
						}
					}
				}
			}
		System.out.println("Output : " + str2);
		}
		public static void main(String[] args) {
			PrintUniqueLetter printUniqueLetter = new PrintUniqueLetter();
			String str = "aakan1ksh44a";
			System.out.println("Input : " + str);
			printUniqueLetter.getUniqueletter(str);
			
		}
	}


