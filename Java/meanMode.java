import java.util.Scanner;

public class meanMode {
	public static int MeanMode(int[] arr) { 
		  
	    int mode=0;
	    int sum=0;
	    int mean=0;
	    int k;
	    int max=1;
	    for(int i=0;i<arr.length-1;i++){
	    	k=0;
	    	sum+=arr[i];
	    	for(int j=1;j<arr.length;j++){
	    		if(arr[i]==arr[j]){
	    			k++;
	    		}
	    		if(max<k){
	    			max=k;
	    			mode=arr[i];
	    		}
	    		
	    	}
	    }
	    
	    mean=(int)Math.round((double)sum/arr.length);
	    if(mean==mode)
	    	return 1;
	    else
	    	return 0;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    //System.out.print(MeanMode(s.nextLine())); 
	  }   
	  
}
