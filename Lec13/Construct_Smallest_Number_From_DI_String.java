package Lec13;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";

	}

	public static String Construct_Smallest_Number(String s) {
		int[] arr = new int[s.length() + 1];
		Stack<Integer> st = new Stack<>();
		int c = 1;
		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				arr[i] = c++;
				// i-1 se jitne bhi D rhgya hai sbko fill krenge
				while (!st.isEmpty()) {
					arr[st.pop()] = c++;
				}
			} else {
				st.push(i);
			}

		}
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i];
		}
		return ans;
	}

}
