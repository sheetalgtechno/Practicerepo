/*Assignment - 40 : 30th Jun'2024 [40 mins]
find total number of digits in array.

input : {"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"}
output : 14*/

package Array;

public class TotalNumberOfDigit {
	
	public static void main(String[] s) {
		TotalNumberOfDigit totalNumberOfDigit = new TotalNumberOfDigit();
		String[] input = {"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"};
		System.out.println("Output : " + totalNumberOfDigit.getTotalDigitOfString(input));
	}
	
	public int getDigitOfString(String input) {
		int countDigit=0;
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				countDigit = countDigit + Character.getNumericValue(ch);
			}
		}
		return countDigit;
	}
	
	public int getTotalDigitOfString(String[] input) {
		int totalDigit=0;
		for(int index=0;index<input.length;index++) {
			totalDigit += getDigitOfString(input[index]);
		}
		return totalDigit;
	}
}	
		
		
		
		
		
		
		
		
		
	