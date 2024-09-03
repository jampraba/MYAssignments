package assignment3;

public class ChangeOddindexToUppercase {

	public static void main(String[] args) {
		String text = "changename";
		String result ="OddindexToUppercase";
		System.out.println(result);
	}
	public static String OddindexToUppercase(String input) {
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
        	char c = input.charAt(i);
        	if (i%2!=0) {
				result.append(Character.toUpperCase(c));
			} else {
                result.append(c);
			}
			
		}
		return result.toString();		

	}

}
