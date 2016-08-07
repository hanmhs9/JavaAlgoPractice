import java.util.Scanner;
import java.util.*;
import java.io.*;


class CountingMinutesI {
	public static int CountingMinutes(String str) { 
		  
		  String[] times = str.split("-");
		  
		  int leftMin = getMin(times[0]);
		  int rightMin = getMin(times[1]);
		  
		  if(rightMin>leftMin)
			  return (rightMin-leftMin);
		  else if(rightMin==leftMin)
			  return 0;
		  else 
			  return (1440+(rightMin-leftMin));
	  }
	  
	  public static int getMin(String times){
		  String[] parts = times.split(":");
		  int mins=0;
		  if(parts[1].endsWith("am")){
			  mins+=(60*Integer.parseInt(parts[0]));
		  }
		  else
			  mins+=(60*Integer.parseInt(parts[0])+720);
		  
		  mins+=Integer.parseInt(parts[1].substring(0, 2));
		  
		  return mins;
		  
	  }
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(CountingMinutes(s.nextLine())); 
		  }   
		  
		}


