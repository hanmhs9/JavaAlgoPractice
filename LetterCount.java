
public class LetterCount {
	public static String LetterCountI(String str){
		String[] words=str.split(" ");
		char letter;
		String compare;
		int[] count=new int[words.length];
		int max=1;
		int maxIndex=0;
		
		for(int i=0;i<words.length;i++){
			count[i]=1;
		}
		for(int i=0;i<words.length;i++){
			compare=words[i];

			for(int j=0;j<compare.length();j++){
				letter=compare.charAt(j);
				for(int k=0;k<compare.length();k++){
					if(j!=k && letter==compare.charAt(k)){
						count[i] ++;
						
					}
				}
			}
			
		}
		for(int i=0;i<words.length;i++){
			if(count[i]>max){
				maxIndex=i;
				max=count[i];
				
			}
		}
		
		if(max == 1)
			return "-1";
		return words[maxIndex];
		

	}
}