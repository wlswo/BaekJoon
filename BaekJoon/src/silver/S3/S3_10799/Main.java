package silver.S3_10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Character> stack = new Stack<Character>();
		int result = 0;
		
		for(int i=0; i<str.length(); i++) {
			char word = str.charAt(i);
			if(word == '(' ) {
				stack.push(word);
			} else {
				stack.pop();
				if(str.charAt(i-1) == '(') {
					result += stack.size();
				}else {
					result ++;
				}
			}
		}
		System.out.println(result);

	}

}
