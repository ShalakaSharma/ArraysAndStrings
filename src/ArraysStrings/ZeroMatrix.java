package ArraysStrings;

public class ZeroMatrix {

	public static void zeroMatrix(int[][] matrix, int n) {
		boolean column[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			boolean foundZero = false;
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					foundZero = true;
					column[j] = true;
				}
			}
			if (foundZero) {
				matrix[i] = new int[n];
			}
		}
		for (int i = 0; i < n; i++) {
			if (column[i]) {
				for (int j = 0; j < n; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 0, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 0, 16 } };

		int n = 4;
		zeroMatrix(matrix, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
