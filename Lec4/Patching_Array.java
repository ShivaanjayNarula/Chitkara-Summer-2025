package Lec4;

public class Patching_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 7 };
		int n = 30;
		System.out.println(Count_Patching(arr, n));

	}

	public static int Count_Patching(int[] arr, int n) {
		long missing = 1;
		int i = 0, count = 0;
		while (missing <= n) {
			if (i < arr.length && missing >= arr[i]) {
				missing += arr[i];
				i++;
			} else {
				missing += missing;
				count++;
			}
		}
		return count;

	}
}
