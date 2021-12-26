package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N2741 {
	public static void main(String[] args) throws IOException {
		//N찍기 
		
		// 방법1. 스캐너 사용
		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		scan.close();
//		
//		for(int i = 1 ; i <= num; i++) {
//			System.out.println(i);
//		}
		
		// 방법2. BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1 ; i <= num; i++) {
			System.out.println(i);
		}
	}
}
