package silver.S4_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new  StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//-10,000,000 ~ 10,000,000
		int n_arr[] = new int[20000001];
		
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			//해당 숫자의 인덱스 +1 
			n_arr[a+10000000]++;
		}
		
	    int m = Integer.parseInt(br.readLine());
	    st = new StringTokenizer(br.readLine()," ");
	    
	    for(int i=0; i<m; i++) {
	    	int cnt = n_arr[Integer.parseInt(st.nextToken())+10000000];
	    	sb.append(cnt+" ");
	    }
	    System.out.println(sb);
		
	}

}
