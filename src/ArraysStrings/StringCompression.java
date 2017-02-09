package ArraysStrings;

public class StringCompression {

	public static void main(String args[]) {
		String str = "aaabbbbccddd";
		System.out.println(compress(str));
	}
	public static String compress(String str) {
		if(str.length()<1) return "";
		
		String compressedStr = "";
		int counter = 1;
		char prevChar = str.charAt(0);
		compressedStr = compressedStr + str.charAt(0);
		for(int i=1;i<str.length();i++) {
			char c = str.charAt(i);
			if(c != prevChar) {
					compressedStr = compressedStr + counter + c;
					counter = 1;
			} else {
				counter++;
				if(i==str.length()-1) {
					compressedStr = compressedStr + counter;
				}
				System.out.println(counter);
			}	
			prevChar = c;
		}
		if(compressedStr.length()>=str.length()) {
			return str;
		} 
		return compressedStr;
	}

}
