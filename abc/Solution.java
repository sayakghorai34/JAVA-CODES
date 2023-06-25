import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br=new BufferedReader(r);  
        String Tc;
        try {
            Tc = br.readLine();
             int T=Integer.parseInt(Tc);
                for(int i=0;i<T;i++){
                    String box;
                    try {
                         box= br.readLine();
                         int Box=Integer.parseInt(box);
                         for(int j=0;j<Box;j++) {
                        	 String book=br.readLine();
                        	 String[] Book=book.split(" ");
                        	 for(i= Book.length-1; i>=0; i--) {
                        		 System.out.print(Book[i]+" ");
         
                        	 }
                         }
                
                       
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
       
    }
    }
