/*

* * * * *   |   1 2 3 4 5   |   A B C D E 
* * * *     |   1 2 3 4     |   A B C D
* * *       |   1 2 3       |   A B C
* *         |   1 2         |   A B
*           |   1           |   A

*/
package PatternPrint;

public class PrintPattern4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=6-i;j++) {
				System.out.print(" "+ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
