package Array;

import java.util.Arrays;

public class AddArray {
	
	public static void main(String[] s) {
		int[] num = {10,20,30,44,22};
		String[] arr = {"ABC","PQR","XYZ","MNO"};
		
		int sum=0;
		String str = " ";
		for(int index=0;index<num.length;index++) {
			sum =sum+num[index];
			System.out.println(num[index]);
		}
		
		System.out.println("Array having " +num.length + " sum is " +sum);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);
	}			
}
