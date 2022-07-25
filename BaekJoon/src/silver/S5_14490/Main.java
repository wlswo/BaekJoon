package silver.S5_14490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a/gcd(a,b)+":"+b/gcd(a,b));
	}
	
	public static int gcd(int a, int b) {
		int temp = 0;
		while(b > 0) {
			temp = a%b;
			a = b;
			b = temp;
		}
		
		return a;
	}

}
