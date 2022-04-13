package B2_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String arr[][] = new String[8][8];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<8; i++) {
			sb.setLength(0);
			sb.append(br.readLine());
			for(int j=0; j<8; j++) {
				arr[i][j] = String.valueOf(sb.charAt(j));
			}
		}
		
		
		int cnt = 0;
		int a = 0;
		for(int i=0; i<8; i++) {
			if(i%2 == 0) a = 0;
			else a = 1;
			for(int j=a; j<8; j+=2) {
				if(arr[i][j].equals("F")) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
