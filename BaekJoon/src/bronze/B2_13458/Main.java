package bronze.B2_13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
	
		int tot = 0 ;
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken()); // 총감독관 응시생수 
		int b = Integer.parseInt(st.nextToken()); // 부감독관 응시생수 
		
		tot += num; //방의 개수 만큼 총감독관은 필요
		
		for(int i=0; i<num; i++) {
			arr[i] -= a;

			if(arr[i] <= 0) continue;
			
			tot += arr[i]/b;
			if(arr[i]%b != 0) {
				tot++;
			}
		}
		System.out.println(tot);

	}

}
