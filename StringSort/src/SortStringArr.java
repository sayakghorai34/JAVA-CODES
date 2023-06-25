import java.util.TreeSet;

public class SortStringArr {
	
	public static void main(String[] args) {
		String[] StringArr= {"Hello","MNO","wducv","PQR","ABC","BAC","DEF"};
		int index=firstLine(StringArr);
		System.out.println(index);				//should return 4 as alphabetically ABC comes first
		
	}
	
	public static int firstLine(String[] StringArr) {
		int i=0;
		TreeSet ts=new TreeSet();
		for(String ele:StringArr) {
			ts.add(ele);
		}
		System.out.println(ts);
		System.out.println(ts.first());
		String element=(String) ts.first();
		for(int j=0;j<StringArr.length;j++) {
			if(StringArr[j].equals(element)) {
				i=j;
			}
		}
		return i;
	}

}
