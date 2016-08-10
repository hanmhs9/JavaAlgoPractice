
public class swapII {
	public static String SwapII(String str) { 
	    char[] cc = str.toCharArray();
	    int num=-1;
	    for(int i=0;i<str.length();i++){
	        if(Character.isLetter(cc[i])){
	            if(Character.isUpperCase(cc[i])){
	                cc[i]=Character.toLowerCase(cc[i]);
	            }
	            else
	                cc[i]=Character.toUpperCase(cc[i]);
	        }
	        else if(Character.isDigit(cc[i])){
	            if(num==-1){
	                num=i;
	            }
	            else if(num!=-1){
	                char temp=cc[num];
	                cc[num]=cc[i];
	                cc[i]=temp;
	                num=-1;
	            }
	        }else 
	            num=-1;
	    }
	       
	    return String.valueOf(cc);
	    
	  } 
}
