/*Assignment - 25 : 2nd Dec'2024 [20 mins]


Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18*/

package Nov_String;

public class SumOfString {
	
	void printCount(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum+=digit;
			}
		}
		System.out.println("Input : "+ str);
		System.out.println("Output is : " + sum);
	}
	
	
	public static void main(String[] args) {
		SumOfString sumOfString=new SumOfString();
		sumOfString.printCount("te1ch2no3cre7dits");
		sumOfString.printCount("techno");
		sumOfString.printCount("4563");
	}
}
