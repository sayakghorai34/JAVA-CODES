import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Result {
    public static long aVeryBigSum(List<Long> ar) {
    	System.out.println(ar);
    int length=ar.size();
    System.out.println(length);
    long sum=0;
    for(int i=0;i<length;i++){
        sum+=(long) ar.get(i);
    }
    return sum;
    }
    public static void main(String[] args) throws IOException {
		List<Long> ar=new ArrayList();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(bufferedReader.readLine());
        String str=bufferedReader.readLine();
        bufferedReader.close();
        String[]strSP=str.split(" ");
        for(String ele:strSP){
            ar.add(Long.parseLong(ele));
        }
        long result = aVeryBigSum(ar);
        System.out.println(result);
       
        
	}

}

