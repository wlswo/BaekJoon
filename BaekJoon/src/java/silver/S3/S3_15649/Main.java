package silver.S3_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visit;
	static int arr[];
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visit = new boolean[n];
		arr = new int[m];
		dfs(n,m,0);
		
		
		
	}
	public static void dfs(int n, int m, int depth) {
		if(depth == m) {
			for(int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			return ; //그 전 노드로 
		}
		
		for(int i=0; i<n; i++) {
			
			//해당 노드를 방문 하지 않았다면?
			if(visit[i] == false) {
				//방문처
				visit[i] = true;
				arr[depth] = i+1;
				dfs(n, m , depth + 1);
				
				//끝까지 파고들어갔다와서 return 되어 이전 노드로 돌아오는 시점
				//i는 어차피 1이 증가하고 그 방문했던 노드를 다시 방문해야 모든 경우의 수가 나오기때문 
				visit[i] = false;
			}
		}
		
		return ;
		
	}

}
