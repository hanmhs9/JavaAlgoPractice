import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMinimum {
	public static String OffLineMinimum(String[] strArr) { 
		  
	    List<Integer> list = new ArrayList<>();
	    int index=0;
	    String s = "";
	    for(int i=0;i<strArr.length;i++){
	        if(strArr[i]=="E" && list.isEmpty()){
	            return null;
	        }
	        if(strArr[i]=="E" && s==""){
	            s+=Integer.toString(Collections.min(list));
	            list.remove(Collections.min(list));
	            //index=list.indexOf(Collections.min(list));
	            	            
	        }else if(strArr[i]=="E" && s!=""){
	            s+=","+Integer.toString(Collections.min(list));
	            list.remove(Collections.min(list));
	            //index=list.indexOf(Collections.min(list));
	        }
	        else{
	            list.add(Integer.parseInt(strArr[i]));
	            //index=list.indexOf(Collections.min(list));
	            System.out.println(list);
	            
	            
	            }
	        
	            
	        }
	    
	       
	    return s;
	}
}
