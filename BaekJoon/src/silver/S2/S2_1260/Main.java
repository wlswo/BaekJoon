package silver.S2_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<Integer> que = new LinkedList<Integer>();
	
	static int arr[][] = new int[1001][1001];
	static boolean checked[] = new boolean[1001];
	
	static StringBuilder sb = new StringBuilder();
	
	static int n = 0; 
	static int start = 0;
	public static void main(String[] args) throws IOException {
		//dfs stack
		//bfs queue
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		
		while(m-- >0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
		}
		
		dfs(start);		
		System.out.println(sb);
		checked = new boolean[1001];
		sb = new StringBuilder();
		bfs();
	}
	
	public static void dfs(int start) {
		checked[start] = true;
		sb.append(start+" ");
		
		for(int i=1; i<=n; i++) {
			if( arr[start][i] == 1 && checked[i] == false ) {
				dfs(i);
			}
		}	
	}
	
	public static void bfs() {
		que.offer(start);
		checked[start] = true;
		System.out.print(start+" ");
		
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			
			for(int i=1; i<=n; i++) {
				if(arr[temp][i] == 1 && checked[i] == false) {
					checked[i] = true;
					que.offer(i);
					System.out.print(i+" ");
				}
			}
		}
	}

}














