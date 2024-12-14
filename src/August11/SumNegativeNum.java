/*Program - 7:
Print sum of negative numbers:

input: te-30ch4noc7red-8its
output: -38*/

package August11;

public class SumNegativeNum {
	
	void getNumber(String input) {
		int sum=0;
		String str="0";
		
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			
			if(Character.isDigit(ch) && input.charAt(index-(str.length()))=='-'){
				str = str + ch;
				
		}else {
				sum=sum+Integer.parseInt(str);
				str = "0";
			}
		}
		System.out.println(sum*-1);
	}
	public static void main(String[] args) {
		SumNegativeNum sumNegativeNum =new SumNegativeNum();
		String input = "te-30ch4noc7red-8its";
		sumNegativeNum.getNumber(input);
	}

}
