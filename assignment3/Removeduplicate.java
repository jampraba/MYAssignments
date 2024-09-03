package assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
	String input = "hi jam";
	String result = removeDuplicatewords(input);

	}

	public static String removeDuplicatewords(String input) {
	String[] words = input.split("\\s+");
	Set<String> seenwords = new HashSet<>();
	List<String> uniquewords = new ArrayList<>();
for(String word : words) {
if (seenwords.add(word)) {
	uniquewords.add(word);
	
}
	
}
	
		return String.join("", uniquewords);
		
	}

}
