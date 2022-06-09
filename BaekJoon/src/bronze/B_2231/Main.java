package bronze.B_2231;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		//1부터 탐색제일 작은값 이니까..
		for(int i=0; i<num; i++) {
			int number = i;
			int sum = 0;	//각 자릿수의 합 
			while(number != 0) {
				sum += number%10;
				number /= 10;
			
			}
			
			if( (i+sum) == num ) {
				result = i;
				break;
			}
	
		}
		System.out.println(result);
		sc.close();
	}

}











