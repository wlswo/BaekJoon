package silver.S5_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int[][] arr = new int[num][2];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
						
		}
		//x값에 대해 정렬 x값이 같다면 y 값 정
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0]-o2[0];					
				}
			}
		});
		/* 람다식 
		 * Arrays.sort(arr, (o1, o2) -> {
		 * 		if(o1[0] == o2[0]){
		 * 			return o1[1] - o2[1];
		 * 		}else{
		 * 			return o1[0] - o2[0];
		 * 		}
		 * });
		 */
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}

}
