package ArraysStrings;

public class StringPermutation {

	public static void main(String[] args) {
		String str1 = "ABCDEFGH";
		String str2 = "HDGEUBFC";
		
		System.out.println(isPermutation(str1, str2));
	}
	
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		
		int[] char_count = new int[128];
		
		for(int i=0;i<str1.length();i++) {
			int val = str1.charAt(i);
			char_count[val]++;
			val = str2.charAt(i);
			char_count[val]--;
		}
		
		for(int i=0;i<128;i++) {
			if(char_count[i]!=0) {
				return false;
			}
		}
		
		return true;
	}
}
