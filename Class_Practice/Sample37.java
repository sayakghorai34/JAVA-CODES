
public class Sample37 {
public static void main(String[] args) {
	int []arr= {5,5,5,5,3};
	int sum=0;
	float res;
	for(int ele:arr) {
		sum+=ele;
	}
	res=(float)(sum)/5;
	System.out.println(res);
}
}
