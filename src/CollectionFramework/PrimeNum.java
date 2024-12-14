/*Assignment - 89 : 31st July'2024

Return the ArrayList of all the prime numbers from given ArrayList.

input : [13,17,66,55,44,23]
output : [13, 17, 23]*/

package CollectionFramework;
import java.util.ArrayList;

public class PrimeNum {
	
	boolean isPrimeNum(int num) {
		boolean flag = true;
		for(int index=2;index<num;index++) {
			if(num%index==0) {
				flag=false;
				break;				
			}
		}
		return flag;
	}
	ArrayList<Integer> getPrimeNum(int[]arr){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int index=0;index<arr.length;index++) {
			boolean flag = isPrimeNum(arr[index]);
			if(flag) {
				numList.add(arr[index]);
			}
		}
		System.out.println(numList);
		return numList;		
	}
	
	public static void main(String[] args) {
		
	//	ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		
		int[] arr = {13,17,66,55,44,23};
		PrimeNum primeNum = new PrimeNum();
		primeNum.getPrimeNum(arr);
		
	}

}
