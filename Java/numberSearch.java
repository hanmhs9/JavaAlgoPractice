
public class numberSearch {
	public static int NumberSearch(String str) { 
		  
	    char[] cc=str.toCharArray();
	    int letters=0;
	    int num=0;
	    for(int i=0;i<cc.length;i++){
	        if(Character.isDigit(cc[i])){
	            num+=Character.getNumericValue(cc[i]);
	        }
	        else if(Character.isLetter(cc[i])){
	            letters++;
	        }
	        
	    }
	    int result = (int)Math.round((double)num/letters);
	       
	    return result;
	    
	  } 
}
