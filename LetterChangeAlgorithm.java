import java.util.Scanner;

public class LetterChangeAlgorithm {
	public static String LetterChanges(String str) { 
		 
		String modified = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) > 96 && str.charAt(i) < 122)
				modified += (char)(str.charAt(i) + 1);
			else if(str.charAt(i) == 122)
				modified += (char)97;
			else
				modified += (char)str.charAt(i);
		}
		
		String last = modified.replaceAll("a" ,"A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u", "U");
		    
		return last;
	} 	
  
  public static void main (String[] args) {  
  
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
