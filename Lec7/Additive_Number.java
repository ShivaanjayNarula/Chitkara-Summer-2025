package Lec7;

import java.math.*;
import java.util.*;

public class Additive_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "199100199";
		List<BigInteger> ll = new ArrayList<>();
		System.out.println(Additive(s, ll));

	}

	public static boolean Additive(String ques, List<BigInteger> ll) {
		if (ques.length() == 0) {
			if (ll.size() >= 3) {
				return true;
			}
			return false;
		}

		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (nonleadingzero(s) && vaildfibo(ll, s)) {
				ll.add(new BigInteger(s));
				boolean f = Additive(ques.substring(cut), ll);
				if (f) {
					return true;
				}
				ll.remove(ll.size() - 1);
			}
		}
		return false;

	}

	private static boolean vaildfibo(List<BigInteger> ll, String s) {
		// TODO Auto-generated method stub
		if (ll.size() <= 1) {
			return true;
		}
		BigInteger fn = new BigInteger(s);
		BigInteger f1 = ll.get(ll.size() - 1);
		BigInteger f2 = ll.get(ll.size() - 2);
		return f1.add(f2).equals(fn);// f1+f2 ==fn
	}

	private static boolean nonleadingzero(String s) {
		// TODO Auto-generated method stub
		if (s.length() <= 1) {
			return true;
		}
		return s.charAt(0) != '0';
	}

}
