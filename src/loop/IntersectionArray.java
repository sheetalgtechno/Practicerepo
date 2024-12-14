/*Assignment - 66 : 13th July'2024


return intersection of 2 array.

input : {10,33,24,55,109}
        {4,109,33,12,100}	
output : {33,109,0,0,0}*/

package loop;

import java.util.Arrays;


public class IntersectionArray {

	public static void main(String[] args) {
		IntersectionArray intersectionArray =new IntersectionArray();
		int[] arr1 = {10,33,24,55,109};
		int[] arr2 = {4,109,33,12,100};
		System.out.println("Input : " + Arrays.toString(arr1));
		System.out.println("Input : " + Arrays.toString(arr2));
		String output = " ";
		
		for(int i=0;i<arr1.length;i++) {
			for(int j =0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					output= output + arr1[i] +"-";
					break;
				}
			}
		}
		output= output.substring(0, output.length()-1);
		//System.out.println(output);
		
		String[] array = output.split("-");
		System.out.println("Output : "+ Arrays.toString(array));
	}
}


