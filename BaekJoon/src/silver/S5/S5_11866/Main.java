package silver.S5_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer> que = new LinkedList<Integer>();
	static int arr[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int k   = Integer.parseInt(st.nextToken());
		
		arr = new int[num];
		
		for(int i=1; i<=num; i++) {
			que.add(i);
		}
		
		solve(que,k);
		
		System.out.println(sb);
	}
	
	public static void solve(Queue<Integer> que, int k) {
		sb.append("<");
		
		while(!que.isEmpty()) { 
			
			for(int i=0; i<k-1; i++) {
				int temp = que.poll();
				que.offer(temp);
			}
			if(que.size() == 1) {
				sb.append(que.poll()+">");
			}else {
				sb.append(que.poll()+", ");				
			}
		}
		
		
		
	}

}
