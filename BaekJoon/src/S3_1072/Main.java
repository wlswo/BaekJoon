package S3_1072;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextInt();
		long y = sc.nextInt();
		
		long z = 100 * y/x ;
		
		
		
		if( z >= 99 ) {
			System.out.println(-1);
		}else {
			long start = 0;
			long end = 2000000000;
			
			while(start < end) {	//  승률이 바뀌는 시점 
				long mid = (start + end) / 2;
				
				long win_late = 100 * (y + mid) / (x + mid); //mid번 횟수후 승률 
				
				if(win_late > z) {//mid 번 게임을 더한후 승률이 초기 승률보다 높을땐 
					end = mid;   //end 값에 중간값넣어서 찾을 범위 반 줄여주고 
				}else {
					start = mid + 1; //그게 아니면 시작값을 mid 로 늘려주고 
				}	
			}
			
			System.out.println(end);
		}
		
		sc.close();
	}
	
}
