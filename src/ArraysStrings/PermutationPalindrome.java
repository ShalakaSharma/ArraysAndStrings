package ArraysStrings;

public class PermutationPalindrome {

	public static void main(String args[]) {
		String str = "Tactoi Coa";
		isPermutation(str);
	}

	public static void isPermutation(String str) {

		int length = str.length();

		int char_count[] = new int[26];

		for (int i = 0; i < length; i++) {
			int c = getCharNumber(str.charAt(i));
			if(c!=-1) {
				char_count[c]++;
			}
		}

		boolean isPermutation = true;
		boolean isOddCharFound = false;
		for (int i = 0; i < 26; i++) {

			if (char_count[i] % 2 == 1) {
				if (!isOddCharFound) {
					isOddCharFound = true;
				} else {
					isPermutation = false;
					break;
				}
			}
		}
		System.out.println(isPermutation);
	}

	public static int getCharNumber(char c) {
		if (c >= 'a' && c <= 'z') {
			return c - 'a';
		} else if (c >= 'A' && c <= 'Z') {
			return c - 'A';
		}
		return -1;
	}
}