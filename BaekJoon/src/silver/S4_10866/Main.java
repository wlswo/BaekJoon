package silver.S4_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException{
		Deque<Integer> deque = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			if(str.startsWith("push_front")) {
				str = str.replace("push_front ", "");
				deque.addFirst(Integer.parseInt(str));
			}
			if(str.startsWith("push_back")) {
				str = str.replace("push_back ", "");
				deque.addLast(Integer.parseInt(str));
			}
			if(str.startsWith("pop_front")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				}else {
					str = str.replace("pop_front ", "");
					sb.append(deque.pollFirst()+"\n");
				}
			}
			if(str.startsWith("pop_back")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				}else {
					str = str.replace("pop_back ", "");
					sb.append(deque.pollLast()+"\n");
				}
			}
			if(str.equals("size")) {
				sb.append(deque.size()+"\n");
			}
			if(str.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}
			if(str.equals("front")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deque.getFirst()+"\n");					
				}
			}
			if(str.equals("back")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(deque.getLast()+"\n");					
				}
			}
		}
		System.out.println(sb);
		
	}

}
