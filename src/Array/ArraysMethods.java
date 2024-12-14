package Array;

public class ArraysMethods {
	
	void stringMethods(String[] arr) {
		String str = "ABCDEFGHI";
		for(int index=0;index<arr.length;index++) {
			int[] newArr = new int[arr.length];
			System.out.println(arr[index]);
		}
		str = str.toLowerCase();
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);
		String str2 =str.replace('F', '*');
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		String str = "ABCDEFGHI";
		String[] arr = {"ABC","PQR","MNO","XYZ","ABC","LMNO","FMG","TUV"};
		ArraysMethods arraysMethods = new ArraysMethods();
		arraysMethods.stringMethods(arr);
	}
}
