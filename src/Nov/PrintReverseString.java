/*Assignment - 19 : 24rd Nov'2024 [20 mins]
Print all the characters of given string in reverse order. 

input : te ch3no
output : o
         n
         3
         h
         c
		 
         e 
         t  	*/

package Nov;

public class PrintReverseString {
	void printRevString(String str ) {
		for(int index=str.length()-1;index>=0;index--){
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[]args) {
		String str="te ch3no";
		new PrintReverseString().printRevString(str);
	}
}