package Lec12;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_element_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,3};
		System.out.println(Arrays.toString(nextGreaterElements(arr)));
	}
	public static int[] nextGreaterElements(int[] nums) {
		Stack<Integer> st=new Stack<>();
		int [] ans=new int [nums.length];
		for(int i=(nums.length*2)-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek() <=nums[i%nums.length]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i%nums.length]=-1;
			}
			else {
				ans[i%nums.length]=st.peek();
			}
			st.push(nums[i%nums.length]);
		}
		return ans;
	}

}
