package B2_1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		//Map? 배열의 인덱스로? 
		String[] arr = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		String three = br.readLine();
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(one))
				res1 = i;
			if(arr[i].equals(two))
				res2 = i;
			if(arr[i].equals(three))
				res3 = i;
		}
		
		long result = (long) ((res1*10 + res2) * Math.pow(10, res3));
		System.out.println(result);
	}

}
