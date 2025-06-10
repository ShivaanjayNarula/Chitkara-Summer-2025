package Lec4;

import java.util.Scanner;

public class Moving_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] v = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();

		}
		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();

		}
		System.out.println(Min_Diff(x, v));
	}

	public static long Min_Diff(int[] x, int[] v) {
		long ans = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				long dx = x[i] - x[j];
				long dv = v[i] - v[j];
				if (dv == 0 || dx * dv >= 0) {
					ans += Math.abs(dx);
				}
			}
		}
		return ans;
	}

}
