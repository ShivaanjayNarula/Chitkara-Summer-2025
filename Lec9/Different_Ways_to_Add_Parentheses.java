package Lec9;

import java.util.ArrayList;
import java.util.List;

public class Different_Ways_to_Add_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "2*3-4*5";
	}

	public static List<Integer> Different_Ways(String expression) {
		if (expression.indexOf('+') == -1 && expression.indexOf('-') == -1 && expression.indexOf('*') == -1) {
			List<Integer> bl = new ArrayList<>();
			bl.add(Integer.parseInt(expression));
			return bl;
		}
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (isoperator(ch)) {
				List<Integer> left = Different_Ways(expression.substring(0, i));
				List<Integer> right = Different_Ways(expression.substring(i + 1));
				for (int a : left) {
					for (int b : right) {
						int x = computing(a, b, ch);
						ans.add(x);
					}
				}
			}

		}
		return ans;

	}

	private static int computing(int a, int b, char ch) {
		// TODO Auto-generated method stub
		if (ch == '+') {
			return a + b;
		} else if (ch == '-') {
			return a - b;
		}
		return a * b;
	}

	public static boolean isoperator(char ch) {
        if(ch=='+'|| ch=='-'|| ch=='*') {
        	return true;
        }
        return false;
	}
}
