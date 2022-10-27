package silver.S4_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String,String> map = new HashMap<String, String>();
		
		for(int i=0; i<n; i++) {
			String name = br.readLine();
			map.put(name, name);
		}
		ArrayList<String> arr = new ArrayList<String>();
		
		int cnt = 0;
		for(int i=0; i<m; i++) {
			String name = br.readLine();
			if( map.get(name) != null ) {
				arr.add(name);
				cnt++;
			}
		}
		
		Collections.sort(arr);
		
		
		System.out.println(cnt);
		
		for(String s : arr) {
			System.out.println(s);
		}
	}

}
