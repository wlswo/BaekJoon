package BaekJoon.src.bronze.B1.B1_1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Character> strlist = new ArrayList<Character>();
		
		
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			for(int i=0; i<str.length(); i++) {
				strlist.add(str.charAt(i));
			}
			
			Collections.reverse(strlist);
			
			String compare_str = "";
			
			for(int i=0; i<str.length(); i++) {
				compare_str += Character.toString(strlist.get(i));
			}
			
			if(str.equals(compare_str)) {
				sb.append("yes\n");
			}else {
				sb.append("no\n");
			}
		}
		System.out.println(sb);
		
	}
}