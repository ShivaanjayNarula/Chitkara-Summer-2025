package Lec13;

import java.util.Stack;

public class Maximum_Score_of_a_Good_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Area(int[] arr, int k) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;// mera interval r-1 tk ka hai
				if (r - 1 >= k) {
					if (st.isEmpty()) {
						ans = Math.max(ans, h * r);
					} else {
						int l = st.peek();
						if (l + 1 <= k) {
							ans = Math.max(ans, h * (r - l - 1));
						}
					}
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty() && r - 1 >= k) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {
				int l = st.peek();
				if (l + 1 <= k) {
					ans = Math.max(ans, h * (r - l - 1));
				}
			}

		}
		return ans;

	}

}
