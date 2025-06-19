package Lec11;

import java.util.Arrays;
import java.util.Stack;

public class Asteroid_Collision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 10, -5, 5, 1, 2, 3, 5, -11 };
		System.out.println(Arrays.toString(asteroidCollision(arr)));
	}

	public static int[] asteroidCollision(int[] arr) {
		Stack<Integer> st = new Stack<>();
		for (int i : arr) {
			if (i < 0) {
				collision(st, i);
			} else {
				st.push(i);
			}
		}
		int[] ans = new int[st.size()];
		for (int i = ans.length - 1; i >= 0; i--) {
			ans[i] = st.pop();
		}
		return ans;
	}

	private static void collision(Stack<Integer> st, int n) {
		// TODO Auto-generated method stub
		// collision not possible
		if (st.isEmpty() || st.peek() < 0) {
			st.push(n);
			return;
		}

		// possiblities of collision

		if (st.peek() + n > 0) {
			return;
		}
		if (st.peek() + n == 0) {
			st.pop();
			return;
		}
		if (st.peek() + n < 0) {
			st.pop();
			collision(st, n);
		}
	}

}
