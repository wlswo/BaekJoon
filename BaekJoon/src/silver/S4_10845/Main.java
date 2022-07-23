package silver.S4_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> que = new LinkedList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
	
			if(str.startsWith("push")) {
				str = str.replace("push ","");
				que.add(Integer.parseInt(str));
			}
			if(str.equals("pop")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.poll()+"\n");
				}
			}
			if(str.equals("size")) {
				sb.append(que.size()+"\n");
			}
			if(str.equals("empty")) {
				if(que.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}
			if(str.equals("front")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.peek()+"\n");
				}
			}
			if(str.equals("back")) {
				if(que.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(que.peekLast()+"\n");
				}
			}
			
		}
		System.out.println(sb);
	}

}
