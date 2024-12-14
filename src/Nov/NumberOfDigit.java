/*Assignment - 22 : 25th Nov'2024 [20 mins]

write a method to return total number of digits from the given input.
print the count in main method.

input : aa1kan33ks4h5a
output : total 5 digits are there in given input.

Hint : boolean Character.isDigit(ch)
*/
package Nov;

public class NumberOfDigit {
	int getCountOfDigit(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		NumberOfDigit NumberOfDigit = new NumberOfDigit();
		System.out.println("Total " + NumberOfDigit.getCountOfDigit("aa1kan33ks4h5a") + " digits are there in given input.");
	}

}