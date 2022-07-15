package silver.S4_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			int coin = Integer.parseInt(br.readLine());
			if(coin > k) {
				break;
			}
			arr.add(coin);
		}
		
		int cnt = 0;
		int mok = 0;
		
		for(int i=arr.size()-1; i>=0; i--) {
			if(k == 0) {
				break;
			}
			
			if(k >= arr.get(i)) {			
				mok = k/arr.get(i);
				cnt += mok;
				k -= mok * arr.get(i);		
			}
		}
		System.out.println(cnt);
		
		
	}
}