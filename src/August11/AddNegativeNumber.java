/*Program - 7:
Print sum of negative numbers:

input: te-3ch4noc7red-8its
output: -11*/

package August11;

public class AddNegativeNumber {
	
	void getSum(String input) {
		String temp="0";
		int sum = 0;

		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			
			if(Character.isDigit(ch)) {
				char ch1 = input.charAt(index-1);
				if(ch1=='-')
					temp = temp +ch;
			}else {
				sum = sum+Integer.parseInt(temp);
				temp = "0";
			}
		}
		System.out.println(sum*-1);
			
	}
	public static void main(String[] args) {
		AddNegativeNumber addNegativeNumber =new AddNegativeNumber();
		String str = "te-3ch4noc7red-8its";
		addNegativeNumber.getSum(str);
	}

}
