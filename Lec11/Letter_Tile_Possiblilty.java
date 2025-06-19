package Lec11;

public class Letter_Tile_Possiblilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AAB";
		int [] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)-'A']++;
		}
		solve(freq,"");
		System.out.println(count);
	}
	private static void solve(int[] freq, String ans) {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				count++;
				System.out.println(ans+(char)('A'+i));
				freq[i]--;
				solve(freq,ans+(char)('A'+i));
				freq[i]++;
			}
		}
	}
	static int count=0;
	private static void solve(int[] freq) {
		// TODO Auto-generated method stub
		for(int i=0;i<26;i++) {
			if(freq[i]>0) {
				count++;
				freq[i]--;
				solve(freq);
				freq[i]++;
			}
		}
	}

}
