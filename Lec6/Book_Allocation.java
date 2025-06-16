package Doubt_Session_2;

import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int m=sc.nextInt();
			int [] arr=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(book_alloc(arr,m));
		}
	}

	private static int book_alloc(int[] arr, int m) {
		// TODO Auto-generated method stub
		int lo=arr[0];
		int hi=0;
		for(int i:arr) {
			hi+=i;
		}
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(arr,m,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int nos, int limit) {
		// TODO Auto-generated method stub
		int s=1;
		int p=0;
		for(int i=0;i<arr.length;) {
			if(p+arr[i]<=limit) {
				p+=arr[i];
				i++;
			}
			else {
				s++;
				p=0;
			}
			if(s>nos) {
				return false;
			}
			
		}
		return true;
	}

}
