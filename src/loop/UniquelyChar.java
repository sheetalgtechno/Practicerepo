/*Assignment - 67 : 15th July'2024 [IMP]

return uniquely present characters from given string.

input : aakanksha
output : nsh*/

package loop;

public class UniquelyChar {
	
	public static void main(String[] args) {
		
		String input="aakanksha";
		System.out.println("Input : " + input);
		String str = " ";
		
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				str = str+ch;
			}			
		}
		System.out.println("Output : " + str);
	}
}
