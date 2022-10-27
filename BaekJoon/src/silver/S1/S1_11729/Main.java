package BaekJoon.src.silver.S1.S1_11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int circle = Integer.parseInt(br.readLine());
		
		//횟수 An = 2^n -1  
		sb.append((int)Math.pow(2, circle)-1 + "\n");
		
		solve(circle,1,2,3);
		System.out.println(sb);
	}
	
	public static void solve(int circle, int start, int mid, int to) {
		
		if(circle == 1) { 
			sb.append(start+" "+to+"\n");
			return;
		}
		
		// A -> C로 이동 
		// N - 1 개를 A -> B로 이동 C는 비어있어야함 => start 지점의 N-1개의 원판을 mid지점으로 옮기는것
		solve(circle - 1, start, to, mid);
		
		//1개를 A -> C로 이동 시키기 
		sb.append(start + " " + to + "\n");
		
		// N-1개를 B -> C로 이동 시키기 => mid 지점의 N-1개의 원판을 to 지점으로 이동 
		solve(circle - 1, mid, start , to);
	}

}












