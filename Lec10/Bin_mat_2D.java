package Lec10;
import java.util.*;
public class Bin_mat_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,1,2,0,1,0,1,2,0,1};
		System.out.println(reconstructMatrix(5,5,arr));
	}
	 public static List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
		 int [][] ans=new int [2][colsum.length];
		 if(solve(upper,lower,colsum,ans,0)) {
			 List<List<Integer>> li=new ArrayList<>();
			 for(int []arr:ans) {
				 List<Integer> l=new ArrayList<>();
				 for(int i:arr) {
					 l.add(i);
				 }
				 li.add(l);
			 }
			 return li;
		 }
		 else {
			 return new ArrayList<>();
		 }
	 }
	private static boolean solve(int upper, int lower, int[] colsum, int[][] ans, int i) {
		// TODO Auto-generated method stub
		if(i == colsum.length && upper==0 && lower==0) {
			return true;
		}
		else if(i==colsum.length){
			return false;
		}
		int sum=colsum[i];
		if(sum==0) {
			ans[0][i]=0;
			ans[1][i]=0;
			return solve(upper,lower,colsum,ans,i+1);
		}
		if(sum==2) {
			ans[0][i]=1;
			ans[1][i]=1;
			return solve(upper-1,lower-1,colsum,ans,i+1);
			
		}
//		inke alava sum ==1 ka case bacha
		if(sum==1) {
			if(upper>0) {
				ans[0][i]=1;
				ans[1][i]=0;
				if(solve(upper-1,lower,colsum,ans,i+1)) {
					return true;
				}
			}
			if(lower>0) {
				ans[0][i]=0;
				ans[1][i]=1;
				if(solve(upper,lower-1,colsum,ans,i+1)) {
					return true;
				}
			}
		}
		return false;
	}

}
