
public class letterRepeatition {
	public static String LetterCount(String str) { 
		String[] s=str.split(" ");
		int[] nums=new int[s.length];
		for(int i=0; i<s.length;i++){
			nums[i]=getRepeated(s[i]);
		}

		int max=0;
		int maxIndex=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				maxIndex=i;
				max=nums[i];
			}
		}
	    return s[maxIndex];	    
	  } 
	
	public static int getRepeated(String s){
		int max=1;
		for(int i=0; i<s.length();i++){
			int repeat=1;
			char currentChar=s.charAt(i);
			for(int j=i+1;j<s.length();j++){
				if(currentChar == s.charAt(j)){
					repeat++;
				}
			}
			if(max<repeat){
				max=repeat;
			}
		}
		
		
		return max;
	}
}
