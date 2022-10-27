package silver.S4_11399;

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
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		while(st.hasMoreElements()) {
			arrlist.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arrlist);
		
		int len = arrlist.size();
		int sum = 0;
		int cnt = len;
		for(int i=0; i<len; i++) {
			sum += arrlist.get(i) * cnt;
			cnt--;
		}
		System.out.print(sum);

	}

}
