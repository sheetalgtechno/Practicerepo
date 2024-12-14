/*
* * * * * * * * *   |   1 2 3 4 5 6 7 8 9   |   A B C D E F G H I
  * * * * * * *     |     1 2 3 4 5 6 7     |     A B C D E F G
    * * * * *       |       1 2 3 4 5       |       A B C D E
      * * *         |         1 2 3         |         A B C
        *           |           1           |           A
*/
package PatternPrint;

public class PrintPattern6 {
	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<6-i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
