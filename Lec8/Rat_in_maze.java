package Lec8;

import java.util.Arrays;
import java.util.Scanner;

public class Rat_in_maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //number of rows
		int m=sc.nextInt(); // number of cols
		
		char[][] arr=new char[n][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().toCharArray();  //input me jo bh string hai usko ek 1d char array me convert kerke index i pe place kr dia
		}
		boolean [][] vis=new boolean [n][m];
		int [][] ans=new int [n][m];
		solve(0,0,arr,vis,ans);
		if(flag ==false) {
			System.out.println("NO PATH FOUND");
		}
	}
	static boolean flag=false;
	private static void solve(int r, int c, char[][] arr, boolean[][] vis, int[][] ans) {
		// TODO Auto-generated method stub
		
		if(r==arr.length-1 && c==arr[0].length-1 && arr[r][c]!='X') {
			flag=true;
			arr[r][c]=1;
			for(int [] a: ans) {
				System.out.println(Arrays.toString(a));
			}
//			System.out.println(ans);
			arr[r][c]=0;
			return;
		}
		if(r>=arr.length|| c>=arr[0].length|| r<0 || c<0 || arr[r][c]=='X' || vis[r][c]==true ) {
			return;
		}
		// r,c these are my current coordinates and i can mark them visited bcause iam on these cells now ready to move furter
		vis[r][c]=true;
		ans[r][c]=1;
		solve(r+1,c,arr,vis,ans);// move down
		solve(r,c+1,arr,vis,ans);// move right
		solve(r-1,c,arr,vis,ans);// move up
		solve(r,c-1,arr,vis,ans);// move left
		vis[r][c]=false;  // backtracking 
		ans[r][c]=0;
	}

}
