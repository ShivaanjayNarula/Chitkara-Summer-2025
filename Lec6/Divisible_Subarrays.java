package Doubt_Session_2;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int [] arr=new int [n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(div_subary(arr,n));
		}
	}

	private static int div_subary(int[] arr, int n) {
		// TODO Auto-generated method stub
		int [] freq=new int [n];
		freq[0]=1;
		int rsum=0;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			rsum+=arr[i];
			int m=rsum%n;
			if(m<0) {
				m+=n;
			}
			ans+=freq[m];
			freq[m]++;
		}
		return ans;
		
	}

}
