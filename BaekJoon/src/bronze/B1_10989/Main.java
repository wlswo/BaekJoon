package bronze.B1_10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		
		int[] counting = new int[10001];
		
		for(int i=0; i<num; i++) {
			counting[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1; i<10001; i++) {
			while(counting[i] > 0) {
				sb.append(i+"\n");
				counting[i]--;
				
			}
			
		}
		System.out.println(sb);

	}

}
