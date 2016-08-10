import java.util.Stack;

public class stringReductionStack {
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
}
