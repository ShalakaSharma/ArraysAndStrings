package ArraysStrings;

public class URLify {

	public static void main(String[] args) {

		String str = "Mr John Smith    ";

		char space = ' ';

		System.out.println((int) space);

		// space corresponds to ascii 32

		System.out.println(urlify(str));

		char[] str_array = str.toCharArray();
		urlifyCTCI(str_array, 13);
		System.out.println(String.copyValueOf(str_array));
	}

	public static String urlify(String str) {

		char[] url_array = new char[str.length()];
		int j = 0;
		for (int i = 0; i < url_array.length; i++) {
			if (str.charAt(j) == ' ') {
				url_array[i] = '%';
				url_array[++i] = '2';
				url_array[++i] = '0';
			} else {
				url_array[i] = str.charAt(j);
			}
			j++;
		}

		return String.copyValueOf(url_array);

	}

	public static void urlifyCTCI(char[] str, int length) {

		int spaceCount = 0;
		int newLength;
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		newLength = length + spaceCount*2;

		for (int i = length-1; i > 0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
	}
}
