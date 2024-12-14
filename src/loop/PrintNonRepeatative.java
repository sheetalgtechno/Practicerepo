package loop;

public class PrintNonRepeatative {

		public static void main(String[] args) {
			String str = "aakanksha";
			PrintNonRepeatative printNonRepeatative =new PrintNonRepeatative();
			printNonRepeatative.PrintUniqChar(str);
		}

		void PrintUniqChar(String str) {
			while(str.length()>0) {
				char ch = str.charAt(0);
				int length = str.length();
				str = str.replace(String.valueOf(ch), "");
				int newLength = str.length();
				int totalLength = length-newLength;
				if(totalLength==1)
					System.out.print(ch);
			}
		}
	}