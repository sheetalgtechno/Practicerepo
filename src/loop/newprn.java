package loop;

public class newprn {

		
		void display(int num) {
			System.out.println("Original number : "+num);
			String str = String.valueOf(num);
			String str1 ="";
			for(int i=str.length()-1;i>=0;i--) {
				char ch = str.charAt(i);
				str1+=ch;
			}
			num = Integer.parseInt(str1);
			System.out.println("Reverse number : "+num);
		}
		
		public static void main(String[] args) {
			newprn a = new newprn();
			a.display(15243);
		}

	}

