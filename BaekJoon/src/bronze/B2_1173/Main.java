package bronze.B2_1173;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N : N번 동안 운동 / m : 최소값 / M : 최대값 / T :운동하고 증가한 맥박 /R : 감소한 맥박수 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int min = m;
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		int cnt = 0;
		int cnt2 = 0;
		
		if(m+T > M) cnt = -1;
		
		while( cnt2 != N ) {
			
			if(cnt == -1) break;
			
			if(m+T > M) { //운동한후 맥박이 M 을 넘는지? 
				if( m-R < min)
					m = min;
				else
					m -= R; //휴식 
			}
			else {
				m += T; //안넘으면 운동 ㄱ 	
				cnt2++;
			}
			cnt++;
			
		}
		System.out.println(cnt);

	}

}
