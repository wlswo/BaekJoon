package silver.S4_1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<n; i++) {
			
			String book = br.readLine();
			if( map.containsKey(book) ) {
				int cnt = map.get(book);
				map.put(book, ++cnt);
			}else {
				map.put(book,1);
			}
		}
		   Integer maxValue = Collections.max(map.values());
		   String[] keys =  map.keySet().toArray(new String[map.size()]);
		   
		   ArrayList<String> arrlist = new ArrayList<String>();
		   
		   for(int i=0; i<map.size(); i++) {
			   if(map.get(keys[i]) == maxValue) {
				   arrlist.add(keys[i]);
			   }
		   }
		   
		   Collections.sort(arrlist);
		   System.out.println(arrlist.get(0));
	}

}
