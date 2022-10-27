package silver.S2_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int arr[][] ;
	static boolean check[][]; 
	static int width;
	static int height;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		
		while(cnt-- >0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			width = Integer.parseInt(st.nextToken()); // 가로 길이 
			height = Integer.parseInt(st.nextToken()); // 세로 길이 
			int k = Integer.parseInt(st.nextToken()); // 배추의 수 
			
			arr = new int[width][height];
			check = new boolean[width][height];
			while(k-- >0) { 
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken()); //x축 
				int y = Integer.parseInt(st.nextToken()); //y축 
				
				arr[x][y] = 1; // 배추투하 
				
			}
				
			sb.append(countworm(arr)+"\n");				
			
		}
		
		System.out.println(sb);
	}
	
	public static int countworm(int arr[][]) {
		//boolean flag = false;  // 배추 무더기 발견 여부 
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if( arr[i][j] == 1 && !check[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void dfs(int x,int y) {
		//갈림길 때문에 다음 탐색할 좌표들을 저장해 놓아야함 
		Queue<int[]> que = new LinkedList<int[]>();
		//좌표저장 
		que.offer(new int[] {x,y});
		//마킹 
		check[x][y] = true;
		
		//x,y => 상하좌우 
		int x2[] = {0,0,-1,1};
		int y2[] = {-1,1,0,0};
		
		while(!que.isEmpty()) {
			int poll[] = que.poll();
			
			//탐색 시작 
			for(int i=0; i<4; i++) {
				int find_x = poll[0] + x2[i];
				int find_y = poll[1] + y2[i];
				
				// 배추밭 벗어 난곳 조건 
				if(find_x < 0 || find_x >= width || find_y < 0 || find_y >= height) {
					continue;
				}
				//x,y 좌표에 배추있고 , 탐색 안한곳이면 
				if(arr[find_x][find_y] == 1 && !check[find_x][find_y] ) {
					//좌표 저장 
					que.offer(new int[] {find_x,find_y});
					check[find_x][find_y] = true;
				}
			}
			
		}
		
		
	}

}
