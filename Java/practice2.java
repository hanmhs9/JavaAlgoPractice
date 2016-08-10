import java.util.*;
import java.awt.*;
import java.lang.*;
import java.lang.reflect.MalformedParametersException;
import java.io.*;
import acm.program.*;
import acm.graphics.*;

public class practice2{
	public static int StringReduction(String str) { 
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++){
			char res=str.charAt(i);
			while(!stack.empty()){
				char peek=stack.peek();
				if(peek == res){ 
					break;
				}
				else{
					char popped = stack.pop();
					res=reduce(res, popped);
				}
			}
			stack.push(res);
			
		}	       
	    return stack.size();
	    
	  } 
	public static char reduce(char c1, char c2){
		return (char)('a'+'b'+'c'-c1-c2);
	}
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(StringReduction(s.nextLine())); 
	  }   
	  
	}
