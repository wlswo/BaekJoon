package B5_20492;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int r1  = (int) (a * 0.78);
		int r2 = (int) (a - (a * 0.2 * 0.22));
		
		System.out.println(r1+" "+r2);
		

	}

}
