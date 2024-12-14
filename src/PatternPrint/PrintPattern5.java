/*
* * * * *    |    1 2 3 4 5    |    A B C D E
  * * * *    |      1 2 3 4    |      A B C D
    * * *    |        1 2 3    |        A B C
      * *    |          1 2    |          A B
        *    |            1    |            A
 */
package PatternPrint;

public class PrintPattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

}
