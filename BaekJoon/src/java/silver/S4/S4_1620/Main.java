package silver.S4_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String Num = br.readLine();
		
		String arr[] = Num.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		Map<String,String> map1 = new HashMap<String, String>();
		Map<String,String> map2 = new HashMap<String, String>();

		for(int i=1; i<n+1; i++) {
			String name = br.readLine();
			
			//  Key : Name       Value : Number 
			map1.put( name, Integer.toString(i) );
			map2.put(Integer.toString(i) , name );
		}
				
		for(int i=0; i<m; i++) {
			String keyOrValue = br.readLine(); // 문자 or 정수
			
			//Key 값으로 value 찾기 Key값은 포켓몬이름 
			if(map1.get(keyOrValue) != null) {
				String getNumber = map1.get(keyOrValue);
				sb.append(getNumber).append("\n");
			//value 값으로 Key값 찾기 value 는 숫자 
			}else {
				String getName = map2.get(keyOrValue);
				sb.append(getName).append("\n");
			}
		}
		System.out.println(sb);
		
	}

}
