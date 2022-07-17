package silver.S4_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			a.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			b.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(a);
		Collections.sort(b);
		Collections.reverse(b);
		
		int total_sum = 0;
		for(int i=0; i<n; i++) {
			total_sum += a.get(i) * b.get(i);
		}
		
		
		
		System.out.println(total_sum);
		
	}

}
