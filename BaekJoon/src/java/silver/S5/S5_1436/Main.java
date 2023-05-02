package silver.S5_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int compare_n = 665;
		int compare_n2 = 665;
		
		int cnt = 0;
		
		while(true) {
			
			compare_n2 = ++compare_n;
			
			
			while(compare_n2 > 0) {
				
				int a = compare_n2%10;
				compare_n2 /= 10;
				
				if(a == 6) {
					
					int b = compare_n2%10;
					compare_n2 /= 10;
					if(b == 6 ) {
						
						int c = compare_n2%10;
						compare_n2 /= 10;
						if(c == 6) {
							cnt++;
							break;
						}
					}
					
				}
				
				
			}
			
			if(n == cnt) {
				System.out.println(compare_n);
				break;
			}
			
			
		}
		
	}

}
