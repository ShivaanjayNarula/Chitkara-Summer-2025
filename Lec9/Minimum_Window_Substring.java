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
		int si = 0, ei = 0, count = 0, size = Integer.MAX_VALUE,start_Inedx=-1;
		while (ei < s.length()) {
			// grow
			char ch = s.charAt(ei);
			freqs[ch]++;
			if (freqs[ch] <= freqt[ch]) {
				count++;
			}

			// shrink
			while (count == t.length() && freqs[s.charAt(si)] > freqt[s.charAt(si)]) {
				freqs[s.charAt(si)]--;
				si++;
			}

			// ans ka upadate
			if (count == t.length() && size > ei - si + 1) {
				size = ei - si + 1;
				start_Inedx=si;
			}

			ei++;
		}
		if(start_Inedx==-1) {
			return "";
		}
		return s.substring(start_Inedx,start_Inedx+size);

	}
}
