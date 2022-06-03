package silver.S5_1064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		double x1 = Double.parseDouble(st.nextToken());
		double y1 = Double.parseDouble(st.nextToken());
		
		double x2 = Double.parseDouble(st.nextToken());
		double y2 = Double.parseDouble(st.nextToken());
		
		double x3 = Double.parseDouble(st.nextToken());
		double y3 = Double.parseDouble(st.nextToken());
		//두점의 기울기 
		double a1 = (y1 - y2)/(x1 - x2); 
		double a2 = (y2 - y3)/(x2 - x3);
		double a3 = (y3 - y1)/(x3 - x1);
		
		
		//세점이 한 직선에 있는 경우 -1
		if(a1 == a2 || a2 == a3 || a1 == a3 ) {
			System.out.println("-1.0");
		}
		else {
			// 제일 긴 변의 길이 구하기
			double size1 =  Math.sqrt(Math.pow( x2-x1 , 2) + Math.pow(y2-y1, 2));
			double size2 =  Math.sqrt(Math.pow( x3-x2 , 2) + Math.pow(y3-y2, 2));
			double size3 =  Math.sqrt(Math.pow( x3-x1 , 2) + Math.pow(y3-y1, 2));
			
			double max = size1;
			double min = size1;
			if(size2 > max ) max = size2; 
			if(size3 > max ) max = size3;
			if(size2 < min ) min = size2;
			if(size3 < min ) min = size3;
 			
			System.out.println(2*max - 2*min);
			
		}
	}

}
