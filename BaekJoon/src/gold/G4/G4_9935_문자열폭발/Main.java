package BaekJoon.src.gold.G4.G4_9935_문자열폭발;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String bomb = br.readLine();
		
		int strlen = str.length();
		int bomblen = bomb.length();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<strlen; i++) {
			stack.push(str.charAt(i));
			
			if(stack.size() >= bomblen) {
				boolean isSame = true;
				
				for(int j=0; j<bomblen; j++) {
					if(stack.get(stack.size()-bomblen+j) != bomb.charAt(j)) {
						isSame = false;
						break;
					}
				}
				if(isSame) {
					for(int j=0; j<bomblen; j++) {
						stack.pop();
					}
				}
			}
		}
		if(!stack.isEmpty()) {
			for(Character c : stack) {
				sb.append(c);
			}
		}
		System.out.println(stack.isEmpty()? "FRULA" : sb);
	}

}
