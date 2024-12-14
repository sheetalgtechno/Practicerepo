/*Assignment 43-
A
B C
D E F
G H I J*/
package Nov_String;

public class PrintPattern43 {

	public static void main(String[] args) {
		char ch = 'A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
