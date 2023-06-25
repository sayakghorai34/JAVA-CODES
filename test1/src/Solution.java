import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str=bufferedReader.readLine();
        String[]strSP=str.split(" ");
        List<Long> ar = new ArrayList();
        for(String ele:strSP){
            ar.add(Long.parseLong(ele));
        }
        long result = Result.aVeryBigSum(ar);
        System.out.println(result);
        bufferedReader.close();
    }
}
