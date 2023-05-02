package silver.S5_10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(st.hasMoreElements()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(set);
		Collections.sort(arrlist);
		
		for(Integer i : arrlist) {
			System.out.print(i + " ");
		}
	}

}
