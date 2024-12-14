package Array;

public class AddNum {

		void add(int[] num) {
			int sum=0;
			for(int index=0;index<=num.length-1;index++) {
			sum =sum+num[index];
			System.out.println(num[index]);
			}
			
			System.out.println("Array having total " + num.length + " numbers, and sum is " + sum);
			
		}
			public static void main(String[] s) {
				int[] num = {10,20,30,44,22};
				AddNum addNum = new AddNum();
				addNum.add(num);
			}
		
}
