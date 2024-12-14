/*Assignemnt 36-print table 1 to 5package Nov_String;*/
package Nov_String;
public class Table1To5 {
	
	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				int num=i*j;
				System.out.println(i+" * "+j+" = " + num);
			}
			System.out.println();
		}
	}
}
