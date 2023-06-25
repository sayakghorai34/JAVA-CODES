
public class PrintCgarecter {
	public char[] createArr() {
		char[] s;
		s=new char[26];
		for(int i=0;i<26;i++) {
			s[i]=(char)('A'+i);
		}
		return s;
	}
public static void main(String[] args) {
	PrintCgarecter obj = new PrintCgarecter();
	char[] arr=obj.createArr();
	for(int i=0;i<26;i++) {
		System.out.println(arr[i]+"\t");
	}
	System.out.println();
}
}
