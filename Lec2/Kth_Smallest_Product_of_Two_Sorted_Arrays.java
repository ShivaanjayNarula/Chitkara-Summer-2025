package Lec2;

public class Kth_Smallest_Product_of_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] arr1 = { -2, -1, 0, 1, 2 };
		int[] arr2 = { -3, -1, 2, 4, 5 };
		long k = 3;
		System.out.println(Kth_Smallest_Product(arr1, arr2, k));

	}

	public static long Kth_Smallest_Product(int[] arr1, int[] arr2, long k) {
		long lo = -1000_000_0000l;
		long hi = 1000_000_0000l;
		long ans = 0;
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (countofproduct(arr1, arr2, mid) >= k) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static long countofproduct(int[] arr1, int[] arr2, long dotproduct) {
		// TODO Auto-generated method stub
		long ans = 0;
		for (long e : arr1) {
			if (e >= 0) {
				int lo = 0;
				int hi = arr2.length - 1;
				long c = 0;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if (e * arr2[mid] <= dotproduct) {
						c = mid + 1;
						lo = mid + 1;
					} else {
						hi = mid - 1;
					}
				}
				ans += c;

			} else {
				int lo = 0;
				int hi = arr2.length - 1;
				long c = 0;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if (e * arr2[mid] <= dotproduct) {
						c = arr2.length-mid;
						hi = mid - 1;
					} else {
						lo = mid + 1;
					}
				}
				ans += c;
			}
		}
		return ans;
	}
}
