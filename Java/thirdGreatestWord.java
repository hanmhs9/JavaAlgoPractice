
public class thirdGreatestWord {
	public static String ThirdGreatest(String[] strArr) { 
		  int greatest=0;
		  int second=0;
		  int third=0;
		  int indexOfthird=0;
		  int indexOfsecond=0,indexOffirst=0;
		  
		  for(int i=0;i<strArr.length;i++){
			  if(strArr[i].length()>greatest){
				  third=second;
				  indexOfthird=indexOfsecond;
				  second=greatest;
				  indexOfsecond=indexOffirst;
				  greatest=strArr[i].length();
				  indexOffirst=i;
				  
			  }else if(strArr[i].length()>second){
				  third=second;
				  indexOfthird=indexOfsecond;
				  second=strArr[i].length();
				  indexOfsecond=i;
				  
			  }else if(strArr[i].length()>third){
				  third=strArr[i].length();
				  indexOfthird=i;
			  }
		  }
		  
		    return strArr[indexOfthird];
		    
		  } 
}
