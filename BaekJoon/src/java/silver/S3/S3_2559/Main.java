package silver.S3_2559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		}
		
		int max = -9999;
		int temp = 0;
		int i = 1;
		while(true) {
			if(k > n) break; 
			//ex 5 라면 0~4  arr[k] - arr[0] 
			temp = arr[k] - arr[i-1];
			if(temp > max) max = temp;
			k++;
			i++;
		}
		
		System.out.println(max);
	}

}
