/*Assignment - 45 : 10th Dec 
#*#*#
#*#
#*#*#
#*#
*/

package Nov_String;

public class PrintPattern45 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i%2==1) {
				for(int j=1;j<=5;j++) {
					if(j%2==0)
						System.out.print("* ");
					else
						System.out.print("# ");
				}
				System.out.println();
			}
			else {
				for(int k=1;k<=3;k++) {
					if(k%2==0)
						System.out.print("* ");
					else
						System.out.print("# ");
				}
				System.out.println();
			}
		}
	}
}
