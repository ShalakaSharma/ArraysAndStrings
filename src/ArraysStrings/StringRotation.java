package ArraysStrings;

public class StringRotation {
	
	public static boolean isStringRotated(String s1, String s2) {
		if(s1.length() == s2.length() && s1.length()>0) {
			String s3 = s2 + s2;
			return isSubstring(s1,s3);
		} 
		return false;
	}
	
	public static boolean isSubstring(String s1, String s2) {
		return s2.contains(s1);
	}
	
	public static void main(String args[]) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isStringRotated(s1, s2));
	}
		
}
