
public class AdditivePersistenceFind {
	public static int AdditivePersistence(int num) { 
		  
		  int total=0, flag=0;
		  if(num<10)
			  return flag;
		  	while(true){
		  		flag++;
		  		String s = Integer.toString(num);
		  		for(int i=0;i<s.length();i++){
		  			int[] arr=new int[s.length()];
		  			arr[i]=Integer.parseInt(Character.toString(s.charAt(i)));
		  			total+=arr[i];		  			
		  		}
		  		if(total<10){
		  			return flag;
		  		}		  		
		  		num=total;
		  		total=0;
		  	}
		
		  	
		  
	
	  }
}
