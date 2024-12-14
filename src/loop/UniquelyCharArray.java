/*Assignment - 68 : 15th July'2024

return uniquely present characters from given string array.

input : {aakanksha, techno, rutuja }
output : {nh, techno, rtja}*/

package loop;

import java.util.Arrays;

public class UniquelyCharArray {

	public static void main(String[] args) {
		String[] arr = {"aakanksha","techno","rutuja"};
		System.out.println("Input : "+ Arrays.toString(arr)); 
		UniquelyCharArray uniquelyCharArray = new UniquelyCharArray();
		uniquelyCharArray.printUniqString(arr);
	}
		
		public String getUniqString(String input){
			String str= " ";
			for(int index = 0; index<input.length();index++) {
				char ch = input.charAt(index);
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					str=str+ch;
				//	str += ch;
				}
			}
			return str;
		}
		
		public void printUniqString(String[] input) {
			String[] arr=new String[input.length];
			for(int index=0;index<arr.length;index++) {
				arr[index] = getUniqString(input[index]);
			}
			System.out.println("Output : " + Arrays.toString(arr));
		}
	}
