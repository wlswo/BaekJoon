package silver.S3_2477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st ;
	
		int arr[] = new int[6];
		int dir[] = new int[6];
		
		int cnt = 0;
		for(int i=0; i<6; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreElements()) {
				dir[cnt] = Integer.parseInt(st.nextToken());
				arr[cnt] = Integer.parseInt(st.nextToken());
				cnt++;
			}
		}
		
		//가장긴 가로의 길이와 인덱스 찾기 
		int wmax = 0;
		int windex = 0;
		for(int i=0; i<6; i++) {
			if( (dir[i] == 1 || dir[i] == 2) && wmax < arr[i]) {
				wmax = arr[i];
				windex = i;
			}
		}
		//작은 사각형의 높이 
		int minHeight = 0;
		if( windex == 0 ) {
			minHeight = Math.abs(arr[5] - arr[1]);
		}else if(windex == 5){
			minHeight = Math.abs(arr[4] - arr[0]);
		}else {
			minHeight = Math.abs(arr[windex-1] - arr[windex + 1]);
		}
		
		
		
		//가장긴 세로의 길이와 인덱스 찾기 
		int hmax = 0;
		int hindex = 0;
		for(int i=0; i<6; i++) {
			if( (dir[i] == 3 || dir[i] == 4 ) && hmax < arr[i] ) {
				hmax = arr[i];
				hindex = i;
			}
		}
		
		//작은 사각형의 밑변
		int minWidth = 0 ;
		if( hindex == 0 ) {
			minWidth = Math.abs(arr[5] - arr[1]);
		}else if(hindex == 5){
			minWidth = Math.abs(arr[4] - arr[0]);
		}else {
			minWidth = Math.abs(arr[hindex-1] - arr[hindex + 1]);
		}
		
		//작은 사각형의 넓이
		int small = minHeight * minWidth;
		//큰 사각형의 넓이 
		int big = wmax * hmax;
		
		int result = (big - small) * n;
		System.out.println(result);
	}
}
