package silver.S4_10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String strarr[] = str.split(" ");
				int num = Integer.parseInt(strarr[strarr.length -1 ]);
				arr.add(num);
			}else {
				switch (str) {
					case "top": {
						if(arr.size() == 0) {
							sb.append("-1\n");
						}else {
							int a = arr.get(arr.size() - 1);
							sb.append(a+"\n");
						}
						break;
						
					}
					case "pop":{
						if(arr.size() == 0) {
							sb.append("-1\n");
						}else {
							int a = arr.get(arr.size() - 1);
							arr.remove(arr.size() - 1);
							sb.append(a+"\n");
						}
						break;
					}
					case "size":{
						sb.append(arr.size()+"\n");
						break;
					}
					case "empty":{
						if(arr.size() == 0) {
							sb.append("1\n");
						}else {
							sb.append("0\n");
						}
					}
				}
				
			}
		}
		System.out.println(sb);
		
	}

}
