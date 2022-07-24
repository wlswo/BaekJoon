package silver.S3_17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<Character>();
		boolean intag = false;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == '<') {
				intag = true;
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append("<");
				continue;
			}
			if(str.charAt(i) == '>') {
				sb.append(">");
				intag = false;
				continue;
			}
			if(intag) {
				sb.append(str.charAt(i));
				continue;
			}
			if(str.charAt(i) == ' ') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(' ');
				continue;
			}
			stack.add(str.charAt(i));
			
			
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}

}
