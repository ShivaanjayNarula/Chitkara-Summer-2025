package DoubtSession_01;

import java.util.Scanner;

public class Number_of_Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long [] arr=new long [n];
		long totalsum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLong();
			totalsum+=arr[i];
		}
		if(totalsum % 3 !=0) {
			System.out.println(0);
			return;
		}
		long target= totalsum/3;
		long runningsum=0;
		long count_of_i=0;
		long totalways=0;
		
		for(int i=0;i<arr.length;i++) {
			runningsum+=arr[i];
			
			if(runningsum==2*target) {
				totalways+=count_of_i;
			}
			if(runningsum==target) {
				count_of_i++;
			}
			
		}
		System.out.println(totalways);
	}

}
