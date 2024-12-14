/*Assignment - 77 : 28th July'2024
print all unique prime number from given array in desc order.
input : { 10, 13, 55, 44, 17, 11, 18 , 11, 55};

output : 
       17
	   13
	   11*/

package Number;

import java.util.Arrays;

public class DesUnqPrimeArray {
	
	boolean isNumPrime(int num) {
		boolean flag=true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	boolean isNumExist(int arr[], int num) {
		boolean flag= false;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==num) {
				flag=true;break;
			}
		}
		return flag;
	}
	
	void printPrimeNumArray(int[]arr) {
		int[] output = new int[arr.length];
		int count=0;
		
		for(int index=0;index<arr.length;index++) {
			boolean flag = isNumPrime(arr[index]);
			if(flag) {
				boolean isExistFlag = isNumExist(output,arr[index]);
				if(!isExistFlag) {
					output[count]=arr[index];
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(output));
		output = Arrays.copyOf(output,count);
		System.out.println(Arrays.toString(output));
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
		
		int[] reverseoutput= new int[output.length];
		
		for(int index=output.length-1;index>=0;index--) {
			reverseoutput[index]=output[output.length-1-index];
		}
		System.out.println(Arrays.toString(reverseoutput));
	}
		
	public static void main(String[] args) {
		DesUnqPrimeArray desUnqPrimeArray = new DesUnqPrimeArray();
		int[] arr = { 10, 13, 55, 44, 17, 11, 18 , 11, 55};
		desUnqPrimeArray.printPrimeNumArray(arr);
	}

}
