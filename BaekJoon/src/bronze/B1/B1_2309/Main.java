package bronze.B1_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		
		int total_height = 0;

		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			total_height += arr[i];
		}
		int execp_num = 0;
		int result = 0;
		loop:
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				execp_num = arr[i] + arr[j];
				result = total_height - execp_num;
				
				if(result == 100) { 
					arr[i] = 0;
					arr[j] = 0;
					break loop;
				}
				
			}
		}
		
		Arrays.sort(arr);
		for(int i : arr) { 
			if(i != 0) {
				System.out.println(i);				
			}
		}
	}
}