package assignments4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}    
String [] Array = {"HCL", "Wipro", "Aspire Systems", "CTS"};

// Add the collection to a list  
List<String> list =new ArrayList<>();
Collections.addAll(list, Array);
Collections.reverse(list);
//Iterate the values in the list 
// Print the required output as Wipro, HCL, CTS, Aspire Systems
System.out.println(String.join(",", list));
	}

}
