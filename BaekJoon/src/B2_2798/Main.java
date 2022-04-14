package B2_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(st.nextToken());
		int max_num = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[num];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		//부르트포스 난사~ 완전대
		int pivot = 0;
		for(int i=0; i<arr.length-2; i++) {  // 8
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k] > max_num) continue;
					else {
						if(pivot < arr[i]+arr[j]+arr[k])
							pivot = arr[i]+arr[j]+arr[k];
							
					}
				}
			}
		}
		System.out.println(pivot);
		
		
	}
}
