package bronze.B1_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st ;
		
		for(int i=0; i<num; i++) {
			
			st = new StringTokenizer( br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
					
			
			int lcm = lcm(a,b);
			sb.append(lcm+"\n");
			
			
		}
		
		
		System.out.println(sb);
		
		
	}
	//최소공약수 
	public static int gcd(int x, int y) {
		if(y == 0) return x;
		return gcd(y, x%y);
	}
	
	//최대공배수 
	public static int lcm(int x, int y) {
		return ( (x*y) / gcd(x,y) );
	}

}
