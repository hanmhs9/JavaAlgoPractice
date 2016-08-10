
public class minCount {
	public static int CountingMinutes(String str) { 
		  
	    String[] s=str.split("-");
	    int num=0; 
	    String ampm1=s[0].substring(s[0].length()-2, s[0].length());
	    String ampm2=s[1].substring(s[1].length()-2, s[1].length());
	    
	    s[0]=s[0].substring(0, s[0].length()-2);
	    s[1]=s[1].substring(0, s[1].length()-2);
	    
	    String[] times1 = s[0].split(":");
	    String[] times2 = s[1].split(":");
	    
	    int hr1=Integer.parseInt(times1[0]);
	    int hr2=Integer.parseInt(times2[0]);
	    int min1=Integer.parseInt(times1[1]);
	    int min2=Integer.parseInt(times2[1]);
	    if(!ampm1.equals(ampm2)){
	        num+=720;
	    }
	    else if(ampm1.equals(ampm2) && (hr1>hr2 || (hr1==hr2 && min1>min2))){
	        num+=1440;
	    }
	    num+=((hr2-hr1)*60 + (min2-min1));
   
	       
	    return num;
	    
	  }
}
