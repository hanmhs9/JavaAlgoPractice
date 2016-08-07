import java.util.ArrayList;
import java.util.List;

public class arrayMatching {
	public static String ArrayMatching(String[] strArr) { 
		int[] arr1 = parseIntArrayFromString(strArr[0]);
		int[] arr2 = parseIntArrayFromString(strArr[1]);
		List<Integer> list = new ArrayList<Integer>();
		
		int maxSize=0;
		if(arr1.length>arr2.length)
			maxSize=arr1.length;
		else 
			maxSize=arr2.length;
		
		for(int i=0;i<maxSize;i++){
			if(i>=arr1.length)
				list.add(arr2[i]);
			else if(i>=arr2.length)
				list.add(arr1[i]);
			else{
				list.add(arr1[i]+arr2[i]);
			}
		}
		String s = Integer.toString(list.get(0));
		for(int i=1;i<list.size();i++){
			s+="-"+list.get(i);
		}
		
		
		
	    return s;
	  } 
	public static int[] parseIntArrayFromString(String s){
		 String[] strArr = s.substring(1,s.length()-1).split(", ");
		 int[] intArr = new int[strArr.length];
		 for(int i=0; i<strArr.length;i++){
			 intArr[i]=Integer.parseInt(strArr[i]);
		 }
				 
		return intArr;
	}
}
