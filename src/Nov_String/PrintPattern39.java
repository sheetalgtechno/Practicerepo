/*Assignment 39 - write a logic to print below pattern.
1
1 2
1 2 3
1 2 3 4*/
package Nov_String;

public class PrintPattern39 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" " +j+" ");
			}
			System.out.println();
		}
	}
}
