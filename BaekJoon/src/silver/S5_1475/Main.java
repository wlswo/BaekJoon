package silver.S5_1475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int six_nine_cnt = 0;
		
		
		//1세트에 9두개 or 6두개로 볼수있으니깐 
		//9996  2세트
		//9999 66
		int arr[] = new int[10]; //1~9
		
		for(int i=0; i<str.length(); i++) {
			int index = str.charAt(i)-'0';
			arr[index]++;
		}
		int set = -1;
		for(int i=0; i<10; i++) {
			if(i == 6 || i == 9) {
				continue;
			}
			if(arr[i] > set) {
				set = arr[i];
			}
		}
		
		six_nine_cnt = arr[6] + arr[9];
		
		if(six_nine_cnt%2 != 0) {
			six_nine_cnt++;
			six_nine_cnt /= 2;
		}else {
			six_nine_cnt /= 2;
		}
		
		if(set >= six_nine_cnt) {
			System.out.println(set);
		}else {
			System.out.println(six_nine_cnt);
		}
		
	}
}
