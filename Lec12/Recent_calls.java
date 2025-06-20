package Lec12;

import java.util.*;

public class Recent_calls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
class RecentCounter {
	Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        int st=t-3000;
        int ed=t;
        while(!q.isEmpty() && q.peek()<st) {
        	q.poll();
        }
        return q.size();
    	
    }
}
