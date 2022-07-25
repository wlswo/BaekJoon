package silver.S3_20291;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while(num-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(),".");
			st.nextElement();
			String str = st.nextToken();
			if(map.get(str) != null) {
				int cnt = map.get(str);
				cnt++;
				map.put(str, cnt);
			}else {
				map.put(str, 1);				
			}
			
			
		}
		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet);
		
		for(String s : keySet ) {
			System.out.println(s+" "+map.get(s));
		}
		
	}

}
