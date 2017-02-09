package ArraysStrings;

public class AssortedSolutions {
	
	public static void main(String[] args) {
		int[] arr = { 5, 3, 14, 10, 2, 5 };
		
		arr = reverse(arr);
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.print(", " + arr[i]);
		}
		System.out.println();
		arr = shortArray(arr, 4);
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.print(", " + arr[i]);
		}
		System.out.println();
		evenOdd(6);
		System.out.println();
		evenOdd(5);
	}
	
	public static int[] reverse(int[] arr) {
		int len = arr.length;
		int originallen = len;
		int i, temp;
		for (i = 0; i < originallen / 2; i++) {
			temp = arr[len - 1];
			arr[len - 1] = arr[i];
			arr[i] = temp;
			len -= 1;
		}
		return arr;
	}

	public static int[] shortArray(int[] arr, int index) {
		int i, len = arr.length;
		if (index < len) {
			for (i = index; i < len - 1; i++) {
				arr[i] = arr[i + 1];
			}
			int[] rarr = new int[len - 1];
			for (i = 0; i < len - 1; i++) {
				rarr[i] = arr[i];
			}
			return rarr;
		} else
			return arr;
	}

	public static void evenOdd(int num) {
		if (num % 2 == 0) {
			int print = 0;
			for (int i = 0; i < num; i++) {
				System.out.print(print + " ");
				print += 2;
			}
		} else {
			int print = 1;
			for (int i = 0; i < num; i++) {
				System.out.print(print + " ");
				print += 2;
			}
		}
	}
}
