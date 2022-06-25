package silver.S2_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int arr[];
	static int need;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int Treecnt = Integer.parseInt(st.nextToken());
		need = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		arr = new int[Treecnt];
		
		for(int i=0; i<Treecnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		
		int start = 0;
		int end = arr[Treecnt - 1];	//제일긴 나무 길이 
		
		while(start+1 < end) {
			int mid = (start + end) /2;
			
			if(check(mid)) {
				start = mid;
			}else {
				end = mid;
			}
			
		}
		System.out.println(start);
		

	}
	
	static boolean check(int CutHeight) {
		long sum = 0;
		long tree;
		
		
		
		for(int i=0; i<arr.length; i++) {
			tree = arr[i];
			if(tree > CutHeight) {
				sum += tree - CutHeight;
			}
		}
		
		if(sum >= need) {
			return true;
		}else {
			return false;
		}
		
	}

}
