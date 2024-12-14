/*Write a Java program to find smallest and second smallest element in an integer array
input: {-9, 3, 36, -25,-25, -9, 71, 0}
output:
Smallest Element : -25
Second Smallest Element : -9*/

package August11;

public class SmallestNumber {
	
	void getSmallestNumber(int[] input) {
		
		int min =0;
		int secMin =0;
		for(int index=0;index<input.length;index++) {
			if(min> input[index])
				min = input[index];	
		}
		
		for(int index=0;index<input.length;index++) {
			if(input[index] == min) {
				input[index] = Integer.MAX_VALUE;
			}
		}
		
		for(int index=0;index<input.length;index++) {
			if(secMin> input[index])
				secMin = input[index];	
		}
		System.out.println(secMin);
		
	}
	public static void main(String[] args) {
		SmallestNumber SmallestNumber =new SmallestNumber();
		int[] input = {-9, 3, 36, -25, -25, -9, 71, 0};
		SmallestNumber.getSmallestNumber(input);
	}

}
