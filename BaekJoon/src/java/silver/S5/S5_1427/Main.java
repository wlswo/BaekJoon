package silver.S5_1427;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String num_len = Integer.toString(num);
		sc.close();
		//자리수 구하기 
		int cnt = num_len.length();
		int[] arr = new int[cnt];
		
		//일의 자리수 부터 배열에 삽입 
		for(int i=0; i<cnt; i++) {
			arr[i] = num%10;
			num /= 10;
		}
		
		Arrays.sort(arr);
		
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
		
	}

}
