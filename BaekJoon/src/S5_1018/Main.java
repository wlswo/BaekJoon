package S5_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 StringBuffer sb = new StringBuffer();
		 int rows = Integer.parseInt(st.nextToken());
		 int cols = Integer.parseInt(st.nextToken());
		 char board[][] = new char[rows][cols];
		 
		 for(int i=0; i<rows; i++) {
			 sb.append(br.readLine());
			 for(int j=0; j<cols; j++) {
				 board[i][j] = sb.charAt(i);
			 }
			 sb.delete(0, sb.length());
		 }
		 
		 
		 for(int i=0; i<rows; i++) {
			 for(int j=0; j<cols; j++) {
				 System.out.print(board[i][j]);
			 }
			 System.out.println();
		 }
		 
		 

	}
	
	
	
	
	
	//넘긴 체스판의 다시 칠해야할 개수 
	public static int block_count(int[][] arr) {
		int cnt = 0 ;
		
		
		
		
		
		
		return cnt;
	}

}
