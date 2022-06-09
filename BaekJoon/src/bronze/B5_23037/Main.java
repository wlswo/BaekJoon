package bronze.B5_23037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		int a = sc.nextInt();
		int result = 0;
		for(int i=0; i<5; i++) {
			int b = a%10;
			a /= 10;
			result += Math.pow(b, 5);
		}
		System.out.println(result);
	}

}
