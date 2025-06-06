package Lec1;

public class Partition_Array_into_Disjoint_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 3, 8, 6 };
		System.out.println(Partition_Array_into_Disjoint(arr));
	}

	public static int Partition_Array_into_Disjoint(int[] arr) {
		int n = arr.length;
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.min(right[i + 1], arr[i]);
		}
		int left = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			left = Math.max(left, arr[i]);// ith index tk maximum nikal rahe hai
			if (left <= right[i + 1]) {
				return i + 1;
			}
		}
		return 0;
	}
}
