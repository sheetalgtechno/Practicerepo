/*Assignment - 38 : 30th Jun'2024 [12-15 mins]

write a method which takes one parameter as String array, and return sum of length of the all the elements.

input : {"Maulik", "Technocredits", "Hi"}
output : 21*/

package Array;

public class PrintElementNumber {
		
		public static void main(String[] s) {
			String[] name = {"Maulik","Technocredits","Hi"};
			int output=0;
			for(int index=0;index<name.length;index++) {
				output = output + name[index].length();
				System.out.println(name[index] + " :- " + name[index].length());
			}
			System.out.println("The sum of length of all elements : " + output );	
		}
}
