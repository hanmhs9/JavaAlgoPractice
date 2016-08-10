import java.util.ArrayList;

public class PrimeChecker {
	public static int PrimeChecker(int num) { 
		  
		ArrayList<String> list = getCombs(String.valueOf(num));
		for(String item: list){
			if(isPrime(Integer.parseInt(item)))
					return 1;
		}
		return 0;    
	  }
	
	public static boolean isPrime(int num){
		if(num<=1)
			return false;
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i == 0) return false;
		}
		return true;		
	}
	
	public static ArrayList<String> getCombs(String num){
		ArrayList<String> list = new ArrayList<String>();
		char[] arr = num.toCharArray();
		
		if(arr.length==2){
			list.add(String.valueOf(arr[0])+String.valueOf(arr[1]));
			list.add(String.valueOf(arr[1])+String.valueOf(arr[0]));
			return list;
		}
		
		String s;
		ArrayList<String> ls;
		for(int i=0; i<arr.length;i++){
			s=new String();
			ls=new ArrayList<String>();
			for(int j=0;j<arr.length;j++){
				if(i!=j){
					s+=String.valueOf(arr[j]);
				}
			}
			ls.addAll(getCombs(s));
			for(String item: ls){
				list.add(String.valueOf(arr[i])+item);
			}
		}
		return list;
		
	}
	 
}
