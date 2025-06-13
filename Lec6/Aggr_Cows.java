package Doubt_Session_2;

import java.util.Arrays;
import java.util.Scanner;

public class Aggr_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int c=sc.nextInt();
			int [] arr=new int [n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int a=agr_cows(arr,c);
			System.out.println(a);
		}
	}

	private static int agr_cows(int[] arr, int c) {
		// TODO Auto-generated method stub
		int lo=0;
		int hi=arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isPossible(arr,c,mid)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] arr, int c, int mid) {
		// TODO Auto-generated method stub
		int cow=1;
		int prevpos=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-prevpos>=mid) {
				cow++;
				prevpos=arr[i];
			}
			if(cow==c) {
				return true;
			}	
		}
		return false;
	}

}
