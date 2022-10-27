package silver.S4_10211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			int cnt = Integer.parseInt(br.readLine());
			int arr[] = new int[cnt];
			int dp[] = new int[cnt];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0; i<cnt; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int max = arr[0];
			dp[0] = arr[0];
			
			//누적합 
			for(int i=1; i<arr.length; i++) {
				//누적합이 음수가 되는 경우 초기화 
				if(dp[i-1] < 0) {
					dp[i-1] = 0;
				}
				dp[i] = dp[i-1] + arr[i];
				max = Math.max(max, dp[i]);
			}
			sb.append(max+"\n");
			
		}
		System.out.println(sb);

	}

}
