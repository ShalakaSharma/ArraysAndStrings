package ArraysStrings;

public class MatrixRotation {

	public static void rotateClockwise(int[][] matrix, int n) {
		if(matrix == null || n<=0) {
			return;
		}
		for(int loop=0;loop<n/2; loop++) {
			int first = loop;
			int last = n - 1 -first;
			for(int i=first;i<last;i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}

	}
	
	public static void rotateAntiClockwise(int[][] matrix, int n) {
		if(matrix == null || n<=0) {
			return;
		}
		for(int loop = 0; loop < n/2; loop++) {
			int first = loop;
			int last = n - 1 - first;
			for(int i = first ; i < last; i++) {
				int offset = i - first;
				int top = matrix [i][last];
				matrix[i][last] = matrix[last][last-offset];
				matrix[last][last-offset]= matrix [last-offset][first];
				matrix[last-offset][first] = matrix [first][i];
				matrix[first][i] = top;
			}
		}	

	}

	public static void main(String args[]) {
		int[][] matrix = { {1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotateClockwise(null,3);
		rotateClockwise(matrix,0);
		rotateAntiClockwise(matrix,0);
		rotateAntiClockwise(null,3);
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----clockwise-------");
		rotateClockwise(matrix,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----anticlockwise-------");
		int[][] matrix2 = { {1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		n=4;
		rotateAntiClockwise(matrix2,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

/* output
 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 
-----clockwise-------
13 9 5 1 
14 10 6 2 
15 11 7 3 
16 12 8 4 
-----anticlockwise-------
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 


*/