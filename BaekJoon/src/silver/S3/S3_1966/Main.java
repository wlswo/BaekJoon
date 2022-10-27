package silver.S3_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int number = Integer.parseInt(br.readLine());
		
		

		for(int i=0; i<number; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // 개수
			int m = Integer.parseInt(st.nextToken()); // 타겟 인덱스

			//**중요** 배열을 원소로 가지는 리스트
			LinkedList<int[]> list = new LinkedList<>();;
			
			int index = 0;							  // 인덱스
			
			st = new StringTokenizer(br.readLine(), " ");
			
			//list 생성
			while(st.hasMoreElements()) { //[index , level] 
				list.offer(new int[]{index, Integer.parseInt(st.nextToken())});
				index++;
			}
			
			//조건 순회 
			int cnt  = 0;
			
			//하나의 테스트 케이스에 대한 반복문
			while(!list.isEmpty()) {
				int first[] = list.poll();
				//중요도가 가장 큰값 여부
				boolean isHigh = true;
				
				//뽑은 값과 나머지 중요도 비교
				for(int j=0; j<list.size(); j++) {
					
					//j번째 위치에 중요도가 더 큰게 있다면
					if(first[1] < list.get(j)[1]) {
						list.offer(first);
						
						//j번째 뒤로 다 보내기 
						for(int k=0; k<j; k++) {
							list.offer(list.poll());
						}
						
						isHigh = false;
						break;
						
					}
				}
				
				if(isHigh == false) {
					continue;
				}
				
				//중요도 검사에서 if문을 안거쳤을때 
				//즉 중요도가 가장 큰 값일 때 
				
				cnt++;
				
				if(first[0] == m) {
					break;
				}
			}
			sb.append(cnt+"\n");
			
		}
		System.out.println(sb);
	}
	
}
