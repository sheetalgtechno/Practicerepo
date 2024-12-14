/*Assignement 37-write loop inside loop (nested for loop), and print frequency of each character. 
input : aakanksha
a->4
k->2
n->1
s->1
h->1*/

package Nov_String;

public class FreqUsingNestedLoop {
	
	void printFreqUsingNestedLoop(String str) {
		
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);//a
			int count=0;
			
			for(int innerIndex=0;innerIndex<str.length();innerIndex++) {
				if(ch==str.charAt(innerIndex)) {//a==k
					count++;
				}
			}
			if(str.indexOf(ch)==index) {
				System.out.println(ch + " -> "+ count);
			}
		}
		
	}
	
	public static void main(String[] args) {
		FreqUsingNestedLoop freqUsingNestedLoop =new FreqUsingNestedLoop();
		String str = "aakanksha";
		System.out.println("Input : "+ str);
		freqUsingNestedLoop.printFreqUsingNestedLoop(str);
		
	}

}
