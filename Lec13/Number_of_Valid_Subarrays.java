package Lec13;

import java.util.Stack;

public class Number_of_Valid_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(Valid_Subarrays(arr));
	}

	public static int Valid_Subarrays(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				st.pop();
			}
			st.push(i);
			count += st.size();
		}
		return count;
	}

}
