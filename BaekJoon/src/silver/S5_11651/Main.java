package silver.S5_11651;

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
		
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1]==o2[1]) {
				return o1[0] - o2[0];
			}else {
				return o1[1] - o2[1];
			}
			
		});
		 
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}

}
