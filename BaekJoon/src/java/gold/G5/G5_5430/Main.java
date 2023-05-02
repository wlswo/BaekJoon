package BaekJoon.src.java.gold.G5.G5_5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st ;

	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> deque;
		
		for(int i=0; i<num; i++) {
			// ex) RDD
			String cmd = br.readLine();
			
			// 배열 길이 
			int len = Integer.parseInt(br.readLine());
			
						
			//문자열 가공 
			st = new StringTokenizer(br.readLine(), "[],");

			
			deque = new ArrayDeque<Integer>();
			
			for(int j=0; j<len; j++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			AC(cmd,deque);
				
		}
		System.out.println(sb.toString().trim());
	}
	
	
	public static void AC(String cmd, ArrayDeque<Integer> deque) {
		boolean flag = true; // true 맨앞 false 맨뒤 
		
		for(char c : cmd.toCharArray()) {
			
			if(c == 'R') {
				flag = !flag; //방향 전환 
				continue;
			}
			
			else { //'D'일때 
				if(deque.size() == 0) {
					sb.append("error\n");
					return;
				}
					
				if(flag == true) {
					deque.removeFirst();
				}else {
					deque.removeLast();
				}
				
			}
			
		}
		//문자열 가공
		makePrint(flag,deque);
		
	}
	
	public static void makePrint(boolean flag, ArrayDeque<Integer> deque) {
		sb.append("[");
		
		while( !deque.isEmpty() ) {
			if(flag == true) {
				sb.append(deque.removeFirst());
				if(deque.size() != 0) {
					sb.append(",");
				}
			}else {
				sb.append(deque.removeLast());
				if(deque.size() != 0) {
					sb.append(",");
				}
			}
			
		}
		sb.append("]\n");
	}
	
}
