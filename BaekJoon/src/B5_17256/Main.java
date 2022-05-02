package B5_17256;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();
		
		System.out.println(b1-a3 + " " + b2/a2 +" "+ (b3-a1));
		sc.close();

	}

}
