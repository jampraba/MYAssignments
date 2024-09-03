package assignment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReverseOddposition {

	public static void main(String[] args) {
	String test = "I am a software engineer";
	String result = reverseoddpositions(test);
	System.out.println(result);
	}

	public static String reverseoddpositions(String input) {
		String[] words = input.split("\\s+");
		List<String> resultwords = new ArrayList<>();
for (int i = 0; i < words.length; i++) {
	if (i%2==1) {
		resultwords.add(new StringBuilder(words[i]).reverse().toString());
	} else {
         resultwords.add(words[i]);
	}
}
		return String.join("", resultwords);
	}
	

}
