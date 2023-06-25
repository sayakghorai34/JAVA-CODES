import java.util.Scanner;

public class Q6 {
	String reverse(String name) {
		String result="";
		for(int i=name.length()-1;i>=0;i--) {
			result=result+name.charAt(i);
		}
		return result;
	}
	
}
