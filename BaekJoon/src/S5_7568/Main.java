package S5_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[][] = new int[num][2];
		int cnt[] = new int[num];
		StringTokenizer st = null;
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			cnt[i] = 1;
		}
		
		
		for(int i=0; i<num-1; i++) {
			for(int j=i+1; j<num; j++) {
				if(arr[i][0] < arr[j][0] & arr[i][1]<arr[j][1]) { //둘다 작다면 
					cnt[i]++;
				}
				else if(arr[i][0] > arr[j][0] & arr[i][1]>arr[j][1])
					cnt[j]++;
			}
			
		}
		for(int i : cnt) {
			System.out.print(i+" ");
		}
	}

}
