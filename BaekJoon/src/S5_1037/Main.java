package S5_1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		int arr[] = new int[num];
		st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		while(st.hasMoreElements()) {
			arr[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		if(arr.length != 1) {
			Arrays.sort(arr);
			int max = arr[arr.length-1];
			int min = arr[0];	
			System.out.println(max*min);
		}
		else if(arr.length == 1) {
			int good = arr[0]*arr[0];
			System.out.println(good);
		}
		
	}

}
