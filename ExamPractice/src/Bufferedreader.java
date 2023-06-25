import java.io.*;

public class Bufferedreader {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input ctrl-d to exit:");
		try {
			String s=br.readLine();
			while(s!=null) {
				System.out.println("Read: "+s);
				s=br.readLine();
			}
			br.close();
			System.out.println("ENded");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
