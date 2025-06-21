package Lec11;

import java.util.Stack;

public class Valid_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{}";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				st.push(ch);
			}
			else if(st.isEmpty()){
				System.out.println("false");
				return;
			}
			else {
				char ch2=st.peek();
				if(Math.abs(ch2-ch)>2) {
					
					System.out.println("False");
					return;
				}
				else {
					st.pop();
				}
			}
		}
		if(st.size()==0) {
			System.out.println("True");
			return;
		}
		else {
			System.out.println("False");
			return;
		}
	}

}
