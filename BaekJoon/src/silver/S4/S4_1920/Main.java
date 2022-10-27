package silver.S4_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreElements()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st= new  StringTokenizer(br.readLine()," ");
		for(int i=0; i<m; i++) {
			int number = Integer.parseInt(st.nextToken());
			if( set.contains(number) ) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
		
		
		
	}

}
