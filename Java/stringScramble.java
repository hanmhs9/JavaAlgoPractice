
public class stringScramble {
	public static String StringScramble(String str1, String str2) { 
	    String s="";
	    StringBuilder sb;
	    String newstring=str2;
	    for(int i=0;i<str1.length();i++){
	        for(int j=0;j<newstring.length();j++){
	            
	            if(str1.charAt(i)==newstring.charAt(j)){
	                s+=newstring.charAt(j);
	                newstring=new StringBuilder(newstring).deleteCharAt(j).toString();
	                break;
	            }
	                
	            
	        }
	    }
	    if(s.length()==(str2.length()))
	        return "true";
	       
	    return "false";
	    
	  } 
}
