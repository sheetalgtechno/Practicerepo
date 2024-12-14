/*Program : 2
String str = "tec1h3no c4redi5ts pu4n1e i4n8dia";
reverse each word at the same position.

output : "onhcet stiderc enup aidni"*/package August11;

public class StringReverse {
	
	String getReverse(String input) {
		String str = " ";
		for(int index=input.length()-1;index>=0;index--) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				str = str + ch;
			}
		}
		return str;
	}
	
	void getReverseString(String input) {
		String[] str= input.split(" ");
		for(int index=0;index<str.length;index++) {
			String str1 = getReverse(str[index]);
			
			System.out.print(str1);
			}
		
	}
	public static void main(String[] args) {
		 
		String input = "tec1h3no c4redi5ts pu4n1e i4n8dia";
		System.out.println(input);
		StringReverse stringReverse =new StringReverse();
		stringReverse.getReverseString(input);
		
	}
}
