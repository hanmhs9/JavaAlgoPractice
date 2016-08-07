import java.util.Scanner;

public class CharacterCodes {
	public static String SimpleSymbols(String str) { 
		
		  boolean first=false;
		  StringBuilder sb = new StringBuilder(str);
		  
		  for(int i=1;i<sb.length();i++){
			  if(((int)(sb.charAt(0))) < 97 || ((int)(sb.charAt(0))) >122){
				  if(((int)(sb.charAt(i))) >= 97 && ((int)(sb.charAt(i))) <= 122){
					  if(((int)(sb.charAt(i-1)))==43 && ((int)(sb.charAt(i+1)))==43)
						  first = true;
					  else
						  first = false;
				      	break;
				  }
			  }
			  
			  	
		  }
		  
		  String result="";
		  if(first)
			  result = "true";
		  else
			  result="false";
		  
		  
		  
		  return result;
		    
	  } 
		    
	public static void main (String[] args) {  
		
		Scanner s = new Scanner(System.in);
		System.out.print(SimpleSymbols(s.nextLine())); 

	}   
		  

}
