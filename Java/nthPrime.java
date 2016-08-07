
public class nthPrime {
	public static int PrimeMover(int num) { 
		  
	    int count, candidate;
	    for(candidate=3, count=1;count<num; candidate++){
	        if(isPrime(candidate)){
	            count++;
	        }
	            
	    }
	       
	    return candidate-1;
	    
	  } 
	  public static boolean isPrime(int num){
	      for(int i=2;i<num;i++){
	          if(num%i==0)
	            return false;
	      }
	      return true;
	  }
}
