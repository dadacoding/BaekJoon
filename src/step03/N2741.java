package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ���

public class N2741 {
	public static void main(String[] args) throws IOException {

		// ���1. ��ĳ�� ���
		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		scan.close();
//		
//		for(int i = 1 ; i <= num; i++) {
//			System.out.println(i);
//		}
		
		// ���2. BufferedReader ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1 ; i <= num; i++) {
			System.out.println(i);
		}
	}
}
