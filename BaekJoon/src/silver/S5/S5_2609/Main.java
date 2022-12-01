package silver.S5_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(a,b));
		System.out.println(lcm(a,b));
		
		
	}
	
	//GCD(a,b) = GCD(b,r) r = a%b  
	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
		
	}
	//최소공배수 Least Common mulitple
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	
	
}
