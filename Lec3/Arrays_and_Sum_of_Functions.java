package Lec3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_and_Sum_of_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
			a[i] = a[i] * (i + 1) * (n - i);// a[i] kitne times interval me aayega ye bhi store kr liya

		}
		Integer[] b = new Integer[n];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);// increasing order me
		Arrays.sort(b, Collections.reverseOrder());// dec order mei
		long ans = 0;
		int mod = 998244353;
		for (int i = 0; i < b.length; i++) {
			ans = (ans + (a[i]%mod * b[i]) % mod) % mod;
		}
		System.out.println(ans);

	}

}
