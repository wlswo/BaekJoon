package silver.S4_13900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// 1 2 3 4
		// 1 3 6 10
		// 1*2 + 1*3 + 1*4 => 1(2+3+4)
		// 2*3 + 2*4 => 2(3+4)
		// 3*4 => 3(4)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		long sum[] = new long[n];
		long total = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		
		for(int i=0; i<n; i++) { 
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sum[0]=arr[0];
		
		for(int i=1; i<n; i++) {
			sum[i] = sum[i-1] + arr[i];
		}
		
		for(int i=0; i<n-1; i++) {
			total += arr[i] * (sum[n-1] - sum[i]);
		}
		System.out.println(total);
	}

}
