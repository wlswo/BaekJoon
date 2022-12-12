package bronze.B3_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0)
				break;
			
			//첫번째 숫자가 2번째 숫자의 약수 ?
			if( (b % a) == 0 ) sb.append("factor\n");
			//첫번째 숫자가 2번째 숫자의 배수 ? 
			else if(a%b == 0) sb.append("multiple\n");
			//둘다 아닐경우 
			else sb.append("neither\n");
		}
				
		System.out.println(sb);		
	}

}
