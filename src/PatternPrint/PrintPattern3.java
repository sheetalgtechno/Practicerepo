/*
         * 			 |           1           |           A
       * * *         |         1 2 3         |         A B C
     * * * * *       |       1 2 3 4 5       |       A B C D E
   * * * * * * *     |     1 2 3 4 5 6 7     |     A B C D E F G
 * * * * * * * * *   |   1 2 3 4 5 6 7 8 9   |   A B C D E F G H I
 | column
 - row
 
 */
package PatternPrint;

public class PrintPattern3 {

	public static void main(String[] args) {
	
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<i;l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int l=1;l<i;l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
