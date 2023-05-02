package silver.S4_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			
			sb.append( check( str ) +"\n");
		}
		System.out.println(sb);
		
	}
	
	public static String check(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char word = str.charAt(i);
			
			if(word == '(' || word == '[') {
				stack.push(word);
			}	
			
			else if(word == ')' || word == ']'){
				
				if(word == ')') {
					if(stack.isEmpty()) {
						return "no";
					}
					if(stack.peek() == '[') {
						return "no";						
					}else {
						
						stack.pop();
					}
				}else {
					if(stack.isEmpty()) {
						return "no";
					}
					if(stack.peek() == '(') {
						return "no";
					}else {
						
						stack.pop();
					}
				}
			}
		}
		
		if(stack.isEmpty()) return "yes";
		else return "no";
	}

}
