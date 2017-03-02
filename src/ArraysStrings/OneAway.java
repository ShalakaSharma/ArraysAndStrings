package ArraysStrings;

public class OneAway {

	public static void main(String args[]) {
		String s1 = "tall";
		String s2 = "talk";
		String s3 = "all";
		String s4 = "tallr";
		String s5 = "taller";
		String s6 = "bale";
		String s7 = "pale";
		newApproach(s6, s7);

		/*
		 * isOneEditAway(s1,s2); isOneEditAway(s1,s3); isOneEditAway(s1,s4);
		 * isOneEditAway(s1,s5);
		 */

		newApproach(s1, s2);
		newApproach(s1, s3);
		newApproach(s1, s4);
		newApproach(s1, s5);
	}

	public static void isOneEditAway(String s1, String s2) {
		System.out.println(s1 + " " + s2);
		int diffInLength = s1.length() - s2.length();
		boolean isOneEditAway = true;
		if (diffInLength == 0) {
			int diffCount = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					diffCount++;
				}
				if (diffCount > 1) {
					isOneEditAway = false;
					break;
				}
			}
		} else if (diffInLength == 1 || diffInLength == -1) {
			// insert or remove
			if (diffInLength == 1) {
				for (int i = 0; i < s2.length(); i++) {
					int diffCount = 0;
					if (s1.charAt(i) != s2.charAt(i)) {
						if (s1.charAt(i + 1) != s2.charAt(i)) {
							diffCount++;
						}
						if (diffCount > 1) {
							isOneEditAway = false;
							break;
						}
					}
				}
			}
		} else {
			isOneEditAway = false;
		}
		System.out.println(isOneEditAway);

	}

	public static void newApproach(String s1, String s2) {
		System.out.println(s1 + " " + s2);
		int diffInLength = s1.length() - s2.length();
		System.out.println("diff" + diffInLength);
		if (diffInLength < -1 || diffInLength > 1) {
			System.out.println(false);
			return;
		}
		boolean isOneEditAway = true;
		int counter = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s2.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					counter++;
				}
				if (counter > 1) {
					System.err.println("counter");
					isOneEditAway = false;
					break;
				}
			}
			if (!isOneEditAway) {
				System.out.println(isOneEditAway);
				return;
			}
		} else {

			if (findLonger(s1, s2) == 2) {
				String temp = s2;
				s2 = s1;
				s1 = temp;
			}

			for (int i = 0; i < s2.length(); i++) {

				if (i != s2.length() - 1 && s1.charAt(i) != s2.charAt(i)) {
					if (s1.charAt(i + 1) != s2.charAt(i)) {
						isOneEditAway = false;
						break;
					}

				}

			}
		}
		System.out.println(isOneEditAway);

	}

	public static int findLonger(String s1, String s2) {
		if (s1.length() >= s2.length()) {
			return 1;
		} else {
			return 2;
		}
	}
}
