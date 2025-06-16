package Lec8;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		printPath(0,0,n,"");
	}

	private static void printPath(int r, int c, int n, String ans) {
		// TODO Auto-generated method stub
		if(r==n-1&& c==n-1) {
			System.out.println(ans);
			return;
		}
		if(r>=n || c>=n) {
			return; 
		}
		printPath(r+1,c,n,ans+"D");// to move downwars
		printPath(r,c+1,n,ans+"R");// to move in right direction
	}

}
