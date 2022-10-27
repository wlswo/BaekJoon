package silver.S3_2346;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		Deque<int[]> link = new ArrayDeque<int[]>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 1;
		while(st.hasMoreElements()) {
			link.add(new int[] {Integer.parseInt(st.nextToken()),cnt});
			cnt++;
		}
		
		boolean isFirst = true;
		
		int balloon[];
		while(num-- >0) {
			
			
			if(isFirst) {
				//맨앞 풍선안의 종이 확인 
				balloon = link.pollFirst();
				System.out.print(balloon[1]+" ");				
			}else {
				//맨뒤 풍선안의 종이 확인 
				balloon = link.pollLast();
				System.out.print(balloon[1]+" ");
			}
			
			//방향 확인 
			if(balloon[0] > 0) {
				 if(!link.isEmpty()) {
					 isFirst = true;
					 for(int i=0; i<balloon[0]-1; i++) {
						 link.addLast(link.pollFirst()); 
					 }					 
				 }
				 
			}else {		
				if(!link.isEmpty()) {
					isFirst = false;
					for(int i=0; i<Math.abs(balloon[0])-1; i++) {
						link.addFirst(link.pollLast());
					}					
				}
				
			}
			
		}
		
	}
	

}
