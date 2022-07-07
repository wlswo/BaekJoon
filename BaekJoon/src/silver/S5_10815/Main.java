package silver.S5_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean arr[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		arr = new boolean[20000001];
		
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreElements()) {
			int index = Integer.parseInt(st.nextToken()) + 10000000;
			arr[index] = true;
		}
		
		int M = Integer.parseInt(br.readLine());
		
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while (st.hasMoreElements()) {
			int index = Integer.parseInt(st.nextToken()) + 10000000;
			if( arr[index] == true ) {
				sb.append("1 ");
			}
			else {
				sb.append("0 ");
			}
		}
		System.out.println(sb);
		
	}

}
