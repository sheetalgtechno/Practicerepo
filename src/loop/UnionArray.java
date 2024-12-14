/*Assignment - 65 : 13th July'2024

return union of 2 array.

input : {10,33,24,55,109}
        {4,55,67,12,100}    
output : {10, 33, 24, 55, 109, 4, 55, 67, 12, 100}
    
    int i = arr1.length;    
    for(int index = 0; index < arr2.length; index++){
        output[i] = arr2[index];
        i++;
    }*/

package loop;

import java.util.Arrays;

public class UnionArray {
	
	public static void main(String[] args) {
		UnionArray unionArray =new UnionArray();
		int[] num = {10,33,24,55,109};
		int[] num1 = {4,55,67,12,100};
		int[] output = new int[num.length+num1.length];
		
		for(int i=0;i<num.length;i++) {
			output[i]=num[i];					
		}
		
		int i=num.length;
		for(int j=0;j<num1.length;j++) {
			output[i]=num1[j];//
			i++;
		}
		System.out.println("Output : " + Arrays.toString(output));
	}
}		
	
