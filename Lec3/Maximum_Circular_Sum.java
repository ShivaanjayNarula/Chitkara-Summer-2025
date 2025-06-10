package Lec3;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 3, -2 };
		System.out.println(Circular_Sum(arr));
	}

	public static int Circular_Sum(int[] arr) {
		int linear_maximum_sum = kadanes_Algo(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid_part_sum = kadanes_Algo(arr);
		int Circular_sum = total_sum + mid_part_sum;
		if(Circular_sum==0) {
			return linear_maximum_sum;
		}
		return Math.max(linear_maximum_sum, Circular_sum);

	}

	public static int kadanes_Algo(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
}
