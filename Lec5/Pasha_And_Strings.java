package DoubtSession_01;

import java.util.Scanner;

public class Pasha_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		int m = sc.nextInt();
		int[] freq = new int[(s.length() / 2) + 2];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			freq[a]++;
		}
		for (int i = 1; i < s.length() / 2; i++) {
			freq[i] += freq[i - 1];
		}
		for (int i = 1; i <= s.length() / 2; i++) {
			if (freq[i] % 2 != 0) {
				int start = i - 1;
				int end = s.length() - i;
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		System.out.println(new String(arr));
	}

}
