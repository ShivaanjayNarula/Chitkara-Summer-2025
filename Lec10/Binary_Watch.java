package Lec10;

import java.util.*;

public class Binary_Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(readBinaryWatch(1));
	}

	public static List<String> readBinaryWatch(int turnedOn) {
		int[] h = { 1, 2, 4, 8 };
		int[] m = { 1, 2, 4, 8, 16, 32 };
		List<String> li = new ArrayList<>();
		for (int hc = 0; hc <= Math.min(turnedOn, 3); hc++) {
			int mc = turnedOn - hc;
			if (mc <= 5) {
				ArrayList<Integer> hr = new ArrayList<>();
				ArrayList<Integer> mi = new ArrayList<>();
				solve(h, hc, hr, 0, 0);
				solve(m, mc, mi, 0, 0);

				for (int a : hr) {
					if (a <= 11) {
						for (int b : mi) {
							if (b <= 59) {
								String s = "";
								if (b < 10) {
									s += a + ":0" + b;
								} else {
									s += a + ":" + b;
								}
								li.add(s);
							}
						}
					}
				}
			}
		}
		return li;

	}

	private static void solve(int[] arr, int count, ArrayList<Integer> ans, int i, int sum) {
		// TODO Auto-generated method stub
		if (i == arr.length && count == 0) {
			ans.add(sum);
		}
		if (i >= arr.length) {
			return;
		}
		if (count > 0) {
			solve(arr, count - 1, ans, i + 1, sum + arr[i]);// pick
		}
		solve(arr, count, ans, i + 1, sum);// pick

	}

}
