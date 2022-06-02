package silver.S5_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}

}
