/*Assignment - 63 : 13th July'2024

return array having maximum numbers from two input array.

input : {10,33,24,55,109}
        {4,55,67,12,100}
		
output : [10, 55, 67, 55, 109]*/

package loop;

import java.util.Arrays;

public class MaxNum {
	public static void main(String[] args) {
		MaxNum maxNum = new MaxNum();
		int[] arr1 = {10,33,24,55,109};
		int[] arr2 = {4,55,67,12,100};
		int[] output = new int [arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>arr2[i]) {
				output[i]=arr1[i];
			}else {
				output[i]=arr2[i];
			}
		}
		System.out.println("OutPut Array : "+ Arrays.toString(output));
	}
	
}