package silver.S3_11478;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		
		HashSet<String> set = new HashSet<String>();
		
		
		String name = "";
		
		for(int i=0; i<len; i++) {
			name = "";
			for(int j=i; j<len; j++) { 
				name += str.substring(j,j+1);
				set.add(name);
			}
		}	
		System.out.println(set.size());
		
		sc.close();
	}

}
