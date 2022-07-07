package silver.S3_14425;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
				
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			String key = sc.next();
			map.put(key, i);
		}
		
		for(int i=0; i<m; i++) {
			String key = sc.next();
			if (map.get(key) != null) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}

}