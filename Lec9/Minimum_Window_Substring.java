package Lec9;

import java.util.Arrays;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC", t = "ABC";
		System.out.println(Minimum_Window(s, t));
	}

	public static String Minimum_Window(String s, String t) {
		int[] freqs = new int[256];
		int[] freqt = new int[256];
		for (int i = 0; i < t.length(); i++) {
			freqt[t.charAt(i)]++;// freqt[t.charAt(i)]= freqt[t.charAt(i)] +1;
		}
		

	}
}







