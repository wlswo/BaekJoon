package B1_1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[1002];
		
		//1 22 333 4444 55555
		
		int cnt = 1;
		for(int i=1; i<1001; i++) {
			for(int j=0; j<i; j++) {
				if(cnt == 1001) break; 
				arr[cnt] = i;
				cnt++;
			}
			
		}
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
