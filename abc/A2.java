
public class A2 {
	int sum() {
		int i,res=0;
		for(i=1;i<=10;i++)
		{
			res=res+i;
		}
		return res;
	}
	public static void main(String[] args) {
		A2 obj=new A2();
		
		System.out.println(obj.sum());
	}
}
