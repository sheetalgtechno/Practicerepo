/*Assignment - 37 : 30th Jun'2024 [12-15 mins]



write a method which takes one parameter as String array, and print all the elements with its length.

input : {"Maulik", "Technocredits", "Hi"}
output : Maulik -> 6
		 Technocredits -> 13
		 Hi -> 2*/

package Array;

public class PrintElements {
	
	public static void main(String[] s) {
		String[] name = {"Maulik","Technocredits","Hi"};
		
		for(int index=0;index<name.length;index++) {
		
			System.out.println(name[index] + " :- " + name[index].length());
		}	
	}
}
	

	
	