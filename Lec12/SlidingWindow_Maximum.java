package Lec12;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		
		int len=nums.length;
		int [] ans=new int [len-k+1];
		Deque<Integer> dq=new LinkedList<>();
		for(int i=0;i<len;i++) {
			// remove indexes out of window
			int st=i-k+1;// Starting index of my window
			while(!dq.isEmpty() && dq.peekFirst() < st) {
				dq.pollFirst();
			}
			
			// remove smaller values from back
			// nums[i] => current elemt  & nums[dq.peekLast()]  ==> vlaue of last index in dq
			while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
				dq.pollLast();
			}
			
			// add index in dq
			dq.add(i);
			
			
			// calculate maximum
			if(i>=k-1) {   // is case  me hi window ka size k bnega isse phle window k se chotti rhegi
				ans[i-k+1]=nums[dq.peekFirst()];
			}
			
		}
		return ans;
	}

}
