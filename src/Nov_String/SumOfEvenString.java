/*Assignment - 30 : 2nd Dec'2024 [15 mins]

Sum of all the even digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 2

input : "techno"
output : 0

input : "4563"
output : 10*/

package Nov_String;

public class SumOfEvenString {
	
	void printEvenString(String str) {
		int sum=0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				if(digit%2==0) {
					sum+=digit;
				}
			}
		}
		System.out.println("Output is : " + sum);
	}
	
	public static void main(String[] args) {
		SumOfEvenString SumOfEvenString =new SumOfEvenString();
		SumOfEvenString.printEvenString("Input : " + "te1ch2no3cre7dits");
		SumOfEvenString.printEvenString("Input : " + "techno");
		SumOfEvenString.printEvenString("Input : " + "4563");
	}

}
