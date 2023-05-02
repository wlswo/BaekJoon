package silver.S4_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<num; i++) {
			sb.append(check(br.readLine())+"\n");
		}
		
		System.out.println(sb);
	}
	
	public static String check(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char word = str.charAt(i);
			if( word == '(') {
				stack.push(word);
			}else if(stack.isEmpty()){
				return "NO";
			}else {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) return "YES";
		else return "NO";
		
	}

}
