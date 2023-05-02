package silver.S4_3036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		int first = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		first = arr[0];
		
		for(int i=1; i<num; i++) {
			
			if( first%arr[i] == 0) {
				System.out.println( Integer.toString(first/arr[i]) + "/1" );
			}else {
				reduceFraction(first, arr[i]);
			}
			
		}
		
		
	}
	public static void reduceFraction(int a, int b) {
		int result = gcd(a,b);
		
		int bunja = a / result;
		int bunmo = b / result;
		
		System.out.format("%d/%d\n",bunja,bunmo);
	}
	
	
	public static int gcd(int a , int b) {
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return Math.abs(a);
	}

}
