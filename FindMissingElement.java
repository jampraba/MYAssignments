package Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	int[] data= {1,4,3,2,8,6,7};
	//find length of the array
	int length = data.length;
//	System.out.println("total length of array :"+length);
	
	//find missing number in the array
	//sort the array
	Arrays.sort(data);
	//1,2,3,4,6,7,8
	int j=data[0];
//	System.out.println("pick one value of array:"+data [3]);	
	for (int i=0;i<=length-1; i++){
		if(data[i]!=j) {
System.out.println("Missing element : "+j);
break;
	}
		//System.out.println(i+" "+j);
		j=j+1;
		}
		

		
			
	
	
	
		
		

	}

}
