/*Assignment 41-write a logic to print below pattern.
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5*/

package Nov_String;

public class PrintPattern41 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

}
