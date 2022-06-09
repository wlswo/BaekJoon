package bronze.B4_1264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			int cnt = 0;
			String str = br.readLine();
			if(str.equals("#")) break;
			
			str = str.toLowerCase();
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
				   || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);

	}

}
