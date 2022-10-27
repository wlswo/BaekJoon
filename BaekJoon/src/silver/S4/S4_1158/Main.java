package silver.S4_1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(st.nextToken());
		int range = Integer.parseInt(st.nextToken());
		
		Deque<Integer> circle = new ArrayDeque<Integer>();
		
		for(int i=1; i<num+1; i++) {
			circle.offer(i);
		}
		sb.append("<");
		while(!circle.isEmpty()) {
			if(circle.size() == 1) {
				circle.offerLast(circle.pollFirst());
				
				sb.append(circle.pollFirst()+">");	
			}else {
				for(int i=0; i<range-1; i++) {
					circle.offerLast(circle.pollFirst());
				}
				sb.append(circle.pollFirst()+", ");				
			}
			
		}
		System.out.println(sb);
	}

}
