  
import java.net.*;
import java.util.*;
import java.io.*;  
public class ThingSpeakField{  
//GET USER
//=================================================================================================================================================================
	protected static List<Integer> getUser(String Url){
		List<Integer> UserList = new ArrayList<Integer>();
		String output  = getUrlContents(Url);  
	    output = output.substring(output.indexOf("[")+1,output.indexOf("]"));
	    String[] res=output.split("[}{]");
	    for(int i=1;i<res.length;i++) {
	    	if(res[i].equals(",")) {
	    		continue;
	    	}
	    	else {
	    		try {
					UserList.add(Integer.parseInt(res[i].substring(res[i].indexOf("field1\":")+9,res[i].indexOf("field2\":")-3)));
				} catch (NumberFormatException e) {}
	    	}
	    }
	    return UserList; 
	}
//=================================================================================================================================================================

//GET TEMPERATURE
//=================================================================================================================================================================
	protected static List<Integer> getTemp(String Url){
		List<Integer> TempList = new ArrayList<Integer>();
		String output  = getUrlContents(Url);  
	    output = output.substring(output.indexOf("[")+1,output.indexOf("]"));
	    String[] res=output.split("[}{]");
	    for(int i=1;i<res.length;i++) {
	    	if(res[i].equals(",")) {
	    		continue;
	    	}
	    	else {
	    		try {
					TempList.add(Integer.parseInt(res[i].substring(res[i].indexOf("field2\":")+9,res[i].indexOf("field3\":")-3)));
				} catch (NumberFormatException e) {}
	    	}
	    }
	    return TempList; 
	}

//GET HeartRate
//=================================================================================================================================================================
	protected static List<Integer> getHR(String Url){
		List<Integer> HRList = new ArrayList<Integer>();
		String output  = getUrlContents(Url);  
		output = output.substring(output.indexOf("[")+1,output.indexOf("]"));
		String[] res=output.split("[}{]");
		for(int i=1;i<res.length;i++) {
		    if(res[i].equals(",")) {
		    	continue;
		    }
		    else {
		    	try {
					HRList.add(Integer.parseInt(res[i].substring(res[i].indexOf("field3\":")+9,res[i].indexOf("field4\":")-3)));
				} catch (NumberFormatException e) {}
		    }
		  }
		return HRList; 
	}
//=================================================================================================================================================================
	
//GET SpO2
//=================================================================================================================================================================
	protected static List<Integer> getSpO2(String Url){
		List<Integer>SpO2List = new ArrayList<Integer>();
		String output  = getUrlContents(Url);  
		output = output.substring(output.indexOf("[")+1,output.indexOf("]"));
		String[] res=output.split("[}{]");
		for(int i=1;i<res.length;i++) {
			if(res[i].equals(",")) {
				continue;
			}
			else {
				try {
					SpO2List.add(Integer.parseInt(res[i].substring(res[i].indexOf("field4\":")+9,res[i].length()-1)));
				} catch (NumberFormatException e) {}
			}
		}
		return SpO2List; 
	}
//=================================================================================================================================================================

	
  public static void main(String[] args)  
  {  
//    String output  = getUrlContents("https://api.thingspeak.com/channels/1826042/feeds.json?results=5");  
//    
//    output = output.substring(output.indexOf("[")+1,output.indexOf("]"));
//    String[] res=output.split("[}{]");
//   // System.out.println(output);
//    for(int i=1;i<res.length;i++) {
//    	if(res[i].equals(",")) {
//    		continue;
//    	}
//    	else {
////    		System.out.println(res[i]);
////    		String user=res[i].substring(res[i].indexOf("field1\":")+9,res[i].indexOf("field2\":")-3);
////    		System.out.println("USER: "+user);
////    		System.out.println("field1:"+res[i].lastIndexOf("field1\":"));
////    		System.out.println("field2:"+res[i].indexOf("field2\":"));
//    }
//    
//  }
     
	  String Url="https://api.thingspeak.com/channels/1826042/feeds.json?results=100";
	  System.out.println("USER_List: "+getUser(Url)+"len="+getUser(Url).size());
	  
	  System.out.println("Temperature_Feed: "+getTemp(Url)+"len="+getTemp(Url).size());
	  System.out.println("HR_Field: "+getHR(Url)+"len="+getHR(Url).size());
	  System.out.println("SpO2_Field: "+getSpO2(Url)+"len="+getSpO2(Url).size());

  }
  

  private static String getUrlContents(String theUrl)  
  {  
    StringBuilder content = new StringBuilder();  
    try  
    {  
      URL url = new URL(theUrl); // creating a url object  
      URLConnection urlConnection = url.openConnection(); // creating a urlconnection object  
  
      // wrapping the urlconnection in a bufferedreader  
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));  
      String line;  
      // reading from the urlconnection using the bufferedreader  
      while ((line = bufferedReader.readLine()) != null)  
      {  
        content.append(line + "\n");  
      }  
      bufferedReader.close();  
    }  
    catch(Exception e)  
    {  
      e.printStackTrace();  
    }  
    return content.toString();  
  }  
}  
