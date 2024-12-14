/*Assignment - 99 : 4th Aug
Find the freq of each num from given array.
int[] arr = {10,10,20,30,30,30,30,40,40,50};
output : {10=2,20=1,30=4,40=2,50=1}*/

package Map;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Map;

public class PrintFreqOfNum {
	
	void printFreq(int[] input) {
		
	Map<Integer,Integer> numFreq = new TreeMap<Integer,Integer>();
	for(int num : input) {
		if(numFreq.containsKey(num)){
			int count = numFreq.get(num);
			numFreq.put(num, count+1);
		}else {
			numFreq.put(num, 1);
		}
	}
	System.out.println("Output : " + numFreq);
} 
	
	public static void main(String[] args) {
		int[] num = {10,10,20,30,30,30,30,40,40,50};
		Map<Integer,Integer> numArr = new TreeMap<Integer,Integer>();
		PrintFreqOfNum printFreqOfNum = new PrintFreqOfNum();
		System.out.println("Input : " +Arrays.toString(num));
		printFreqOfNum.printFreq(num);
	}

}
