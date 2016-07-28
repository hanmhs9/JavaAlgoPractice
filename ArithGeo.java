
public class ArithGeo {
	public static String ArithGeo(int[] arr){
		String result="-1";
		
		for(int i =0; i<arr.length-2; i++){
			if(arr[i+1]-arr[i] != arr[i+2]-arr[i+1]){
				if(arr[i+1]/(double)arr[i] != arr[i+2]/(double)arr[i+1]){
					result = "-1";
					break;
				}
				else if(arr[i+1]/(double)arr[i] == arr[i+2]/(double)arr[i+1])
					result = "Geometric";
										
			}
			else if(arr[i+1]-arr[i] == arr[i+2]-arr[i+1])
				result = "Arithmetic";
		}
		return result;
		
	}
	
	public static void main (String[] args){
		//Scanner s = new Scanner(System.in);
		int[] arr = {5,25,125,625,3125};
		System.out.print(ArithGeo(arr));

	}


}
