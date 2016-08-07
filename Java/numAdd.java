import java.util.Scanner;

public class numAdd {
	public static int NumberAddition(String str) { 
		   
		int sum=0;
		String num="";
		char letter;
		
		for(int i=0; i<str.length();i++){
			letter=str.charAt(i);
			if(Character.isDigit(letter)){
				num+=letter;
			}
			else if(num!=""){
				sum+=Integer.parseInt(num);
				num="";
			}
		}
		if(num!="")
			sum+=Integer.parseInt(num);
	   
	       
	    return sum;
	    	
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(NumberAddition(s.nextLine())); 
	  }   
	  
	}

