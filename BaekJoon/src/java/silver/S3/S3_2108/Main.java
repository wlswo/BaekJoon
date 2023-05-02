package silver.S3_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//1.산술평균
		double sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println(Math.round(sum/num));
		
		//2.중앙값
		Arrays.sort(arr);
		System.out.println(arr[(num-1)/2]);
		
		//3.최빈값 빈도수가 가장높은 값
		
		int count = 0; //빈도수 계산
		int max = -1;
		
		int mod = arr[0]; // 최빈값 
		boolean check = false;
		//최빈값 구하는 반복문
		for(int i=0; i<num-1; i++) {
			if(arr[i] == arr[i+1]) { //연속되면 카운트 배열이 이미정렬되어 있는 상태니깐 가능 
				count++;
			}else {
				count = 0;
			}
			
			if(max < count) { //최빈값 갱신 
				max = count ;
				mod = arr[i]; 
				check = true; // 최빈값 들어오면 true 
			}else if(max == count && check == true) { //빈도수가 같은 상태에서 true 이면 2번째 최빈 
				mod = arr[i];
				check = false;
			}
			
		}
		System.out.println(mod);
		
		
		
		//4.범위 출력
		int range = arr[num-1] - arr[0];
		System.out.println(range);
	}

}











