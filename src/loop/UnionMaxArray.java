/*Assignment - 64 : 13th July'2024

return array having maximum numbers from two input array, if array length is not same, add all extra elements of bigger array at the end..

input : {10,33,24,55,109,0,0,0}
        {4,55,67,12,100,4,23,39}
        
output : [10, 55, 67, 55, 109, 4, 23, 39]*/

package loop;

import java.util.Arrays;

public class UnionMaxArray {
	public static void main(String[] args) {
		int[] num = {10,33,24,55,109};
		int[] num1 = {4,55,67,12,100,4,23,39};
		
		System.out.println("Input : "+ Arrays.toString(num));
		System.out.println("Input : "+ Arrays.toString(num1));
				
		for(int i=0;i<num.length;i++) {
			if(num[i]>num1[i]) {
				num1[i]=num[i];
			}
		}
		System.out.println("Output : "+ Arrays.toString(num1));
	}
}