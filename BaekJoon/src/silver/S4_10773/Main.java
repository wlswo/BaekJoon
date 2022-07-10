package silver.S4_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		for(int i=0; i<num; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if( a == 0) {
				int size = arr.size();
				arr.remove(size - 1);
			}
			
			else {
				arr.add(a);
			}
		}
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
