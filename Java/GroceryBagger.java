import java.util.HashMap;

public class GroceryBagger {
	public static int minimumBags(int str, String[] itemType) { 
		int bags=0;
		if(itemType.length == 0)
			return bags;
		HashMap map = new HashMap();
		int idx=0;
		for(int i=0; i<itemType.length; i++){
			String s=itemType[i];
			if(!map.containsKey(s)){
				map.put(s, new Integer(idx));
				idx++;
			}
		}
		int[] a=new int[idx];
		for(int i=0;i<itemType.length;i++){
			int n=((Integer)map.get(itemType[i])).intValue();
			a[n]++;
		}
		
		int ret=0;
		for(int i=0; i<a.length;i++){
			ret+=(a[i]+str-1)/str;
		}
		
		
		return ret;
	  } 
}
