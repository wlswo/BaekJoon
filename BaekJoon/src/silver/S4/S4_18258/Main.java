package silver.S4_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException{
		Deque<Integer> arr = new ArrayDeque<Integer>();
		
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
					case "pop":{
						if(arr.isEmpty()) {
							sb.append("-1\n");
						}else {
							int a = arr.pollFirst();
							sb.append(a+"\n");
						}
						break;
					}
					case "size":{
						sb.append(arr.size()+"\n");
						break;
					}
					case "empty":{
						if(arr.isEmpty()) {
							sb.append("1\n");
						}else {
							sb.append("0\n");
						}
						break;
					}
					case "front":{
						if(arr.isEmpty()) {
							sb.append("-1\n");
						}else {
							int a = arr.getFirst();
							sb.append(a+"\n");							
						}
						break;
					}
					case "back":{
						if(arr.isEmpty()) {
							sb.append("-1\n");
						}else {
							int a = arr.getLast();
							sb.append(a+"\n");
						}
						break;
					}
				}
				
			}
		}
		System.out.println(sb);
		
	}

}